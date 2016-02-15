package br.com.kxiass.model;

/**
 * Created by andersonacs on 13/02/16.
 */
public class Items {

    String title;
    Class<?> fragment;

    public Items(String title, Class<?> className) {
        this.title = title;
        this.fragment = className;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Class<?> getFragment() {
        return fragment;
    }

    public void setFragment(Class<?> fragment) {
        this.fragment = fragment;
    }
}
