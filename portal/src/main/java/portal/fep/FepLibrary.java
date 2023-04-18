package portal.fep;

import com.sun.jna.Pointer;
import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;

public interface FepLibrary extends Library {

    FepLibrary INSTANCE = Native.load("Fep", FepLibrary.class);

    interface FepCallback extends Callback {
        void invoke(Pointer pStock);
    }

    void fepConnect();

    void fepDisconnect();

    void fepSetCallback(FepCallback callback);

    void fepRegisterEvent(String eventType);

    void fepUnregisterEvent(String eventType);

    void fepTriggerEvent(String eventType, String eventData);

}
