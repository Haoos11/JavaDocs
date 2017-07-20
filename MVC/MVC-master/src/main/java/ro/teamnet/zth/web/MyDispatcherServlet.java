package ro.teamnet.zth.web;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.appl.controller.EmployeeController;
import ro.teamnet.zth.fmk.AnnotationScanUtils;
import ro.teamnet.zth.fmk.MethodAttributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;


/**
 * Created by Silviu.Marin on 20-Jul-17.
 */
public class MyDispatcherServlet extends HttpServlet {

    Map<String, MethodAttributes> hashMap = new HashMap<>();

    @Override
    public void init() throws ServletException {
        Iterable<Class> list = new LinkedList<>();

        try {
            list = AnnotationScanUtils.getClasses("ro.teamnet.zth.api.controller");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterator<Class> iterator = list.iterator();
        while (iterator.hasNext()){
            Class ctrlClass = iterator.next();
            MyController myController = (MyController) ctrlClass.getDeclaredAnnotation(MyController.class);
            String url = myController.urlPath();

            for (Method method : ctrlClass.getDeclaredMethods()) {
                String key = url + method.getDeclaredAnnotation(MyRequestMethod.class).urlPath() + "_" +
                        method.getDeclaredAnnotation(MyRequestMethod.class).methodType();

                MethodAttributes methodAttributes = new MethodAttributes();

                methodAttributes.setControllerClass(ctrlClass.getName());
                methodAttributes.setMethodName(method.getName());
                methodAttributes.setMethodType(method.getDeclaredAnnotation(MyRequestMethod.class).methodType());

                hashMap.put(key, methodAttributes);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().write("ceva");
        dispatchReplay(req,resp,"GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.getWriter().write("ceva");
    }

    private void dispatchReplay(HttpServletRequest req, HttpServletResponse resp, String methodType){
        try {
            Object resultToDisplay = dispatch(req ,methodType);
            reply(resp);
        } catch (Exception e)
        {
            sendExceptionError();
        }
    }

    private Object dispatch(HttpServletRequest request, String methodType) throws ClassNotFoundException {
        String key =  request.getPathInfo();
        MethodAttributes m = hashMap.get(key);

        Object toReturn = null;

        try {
            Object execution = Class.forName(m.getControllerClass()).newInstance();
            toReturn = execution.getClass().getMethod(m.getMethodName()).invoke(execution);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        return toReturn;


//////////////////////////////
//        String url = request.getPathInfo();
//        MethodAttributes attributes;
//        String path;
//
//
//        if(!url.startsWith("/departments") && !url.startsWith("/employees") && !url.startsWith("/jobs") && !url.startsWith("/locations")){
//
//        }
//
//        path = url + "/" + methodType;
//
//        HashMap<Object, Object> allowedMethods = null;
//        attributes = (MethodAttributes) allowedMethods.get(path);


    }

    private void reply(HttpServletResponse resp){

    }

    private void sendExceptionError(){

    }


}
