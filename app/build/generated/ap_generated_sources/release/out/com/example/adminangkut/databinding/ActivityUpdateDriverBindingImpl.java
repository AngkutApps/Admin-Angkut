package com.example.adminangkut.databinding;
import com.example.adminangkut.R;
import com.example.adminangkut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityUpdateDriverBindingImpl extends ActivityUpdateDriverBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rb_l, 10);
        sViewsWithIds.put(R.id.rb_p, 11);
        sViewsWithIds.put(R.id.btn_update, 12);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityUpdateDriverBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityUpdateDriverBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[12]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[5]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.RadioButton) bindings[11]
            );
        this.etDaerahTujuan.setTag(null);
        this.etKursiKosong.setTag(null);
        this.etLokasiTerkini.setTag(null);
        this.etMerkKendaraan.setTag(null);
        this.etNamaDriver.setTag(null);
        this.etNoHpCadangan.setTag(null);
        this.etNoHpUtama.setTag(null);
        this.etPlat.setTag(null);
        this.etWarnaKendaraan.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.driver == variableId) {
            setDriver((com.example.adminangkut.data.model.Driver) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDriver(@Nullable com.example.adminangkut.data.model.Driver Driver) {
        this.mDriver = Driver;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.driver);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String driverNamaDriver = null;
        java.lang.String driverKursiKosong = null;
        java.lang.String driverMerkKendaraan = null;
        java.lang.String driverDaerahTujuanDriver = null;
        java.lang.String driverNoHpUtama = null;
        java.lang.String driverNoHpCadangan = null;
        java.lang.String driverLokasiTerkini = null;
        java.lang.String driverPlatKendaraan = null;
        java.lang.String driverWarnaKendaraan = null;
        com.example.adminangkut.data.model.Driver driver = mDriver;

        if ((dirtyFlags & 0x3L) != 0) {



                if (driver != null) {
                    // read driver.namaDriver
                    driverNamaDriver = driver.getNamaDriver();
                    // read driver.kursiKosong
                    driverKursiKosong = driver.getKursiKosong();
                    // read driver.merkKendaraan
                    driverMerkKendaraan = driver.getMerkKendaraan();
                    // read driver.daerahTujuanDriver
                    driverDaerahTujuanDriver = driver.getDaerahTujuanDriver();
                    // read driver.noHpUtama
                    driverNoHpUtama = driver.getNoHpUtama();
                    // read driver.noHpCadangan
                    driverNoHpCadangan = driver.getNoHpCadangan();
                    // read driver.lokasiTerkini
                    driverLokasiTerkini = driver.getLokasiTerkini();
                    // read driver.platKendaraan
                    driverPlatKendaraan = driver.getPlatKendaraan();
                    // read driver.warnaKendaraan
                    driverWarnaKendaraan = driver.getWarnaKendaraan();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etDaerahTujuan, driverDaerahTujuanDriver);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etKursiKosong, driverKursiKosong);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etLokasiTerkini, driverLokasiTerkini);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etMerkKendaraan, driverMerkKendaraan);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNamaDriver, driverNamaDriver);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNoHpCadangan, driverNoHpCadangan);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNoHpUtama, driverNoHpUtama);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPlat, driverPlatKendaraan);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etWarnaKendaraan, driverWarnaKendaraan);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): driver
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}