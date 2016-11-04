package model;

/**
 * Created by nikhilkumartulseja on 03/11/16.
 */
public class DrawerItem {

    private boolean showNotify;
    private String title;

    public DrawerItem() {

    }
    public DrawerItem(boolean showNotify, String title) {
        this.showNotify = showNotify;
        this.title = title;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
