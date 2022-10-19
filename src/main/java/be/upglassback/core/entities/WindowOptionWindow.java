package be.upglassback.core.entities;

import be.upglassback.core.entities.compoundID.WindowOptionWindowPK;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@NamedQueries( value = {
        @NamedQuery(name = "WindowOptionWindow.byWindowAndOptions", query = "select wow from WindowOptionWindow wow where wow.window.idWindow = :id"),
        @NamedQuery(name = "WindowOptionWindow.removeById", query = "delete from WindowOptionWindow wow where wow.window.idWindow = :id"),
        @NamedQuery( name = "WindowsOptionWindow.getIdoption", query = "select wow.optionsWindow from WindowOptionWindow wow "
                + "where wow.window.idWindow  = :id")
} )
@Entity
@IdClass( WindowOptionWindowPK.class )
@Table( name = "windows_options_windows" )
public class WindowOptionWindow implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn( name = "windows", nullable = false )
    private Window window;

    @Id
    @ManyToOne
    @JoinColumn( name = "options_windows", nullable = false )
    private OptionsWindow optionsWindow;

    public void setOptionsWindow( OptionsWindow optionsWindows ) {
        this.optionsWindow = optionsWindows;
    }
    
    public OptionsWindow getOptionsWindow() {
        return optionsWindow;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow( Window window ) {
        this.window = window;
    }

    @Override public boolean equals( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        WindowOptionWindow that = (WindowOptionWindow) o;
        return Objects.equals( window, that.window ) && Objects.equals( optionsWindow,
                that.optionsWindow );
    }

    @Override public int hashCode() {
        return Objects.hash( window, optionsWindow );
    }
}
