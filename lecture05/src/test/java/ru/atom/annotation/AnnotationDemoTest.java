package ru.atom.annotation;

import org.junit.Ignore;
import org.junit.Test;



import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

@Ignore
public class AnnotationDemoTest {

    @Test
    public void countOverride() throws Exception {
        assertThat(AnnotationDemo.getNumberOfAnnotatedMethods(
                ru.atom.servlet.mm.ConnectionHandler.class, Override.class), is(equalTo(0)));
    }

    @Test
    public void countGet() throws Exception {
        assertThat(AnnotationDemo.getNumberOfAnnotatedMethods(
                ru.atom.boot.hw.HelloJerseyWorld.class, GET.class), is(equalTo(1)));
    }

    @Test
    public void countPost() throws Exception {
        assertThat(AnnotationDemo.getNumberOfAnnotatedMethods(
                ru.atom.boot.mm.ConnectionHandler.class, POST.class), is(equalTo(1)));
    }
}
