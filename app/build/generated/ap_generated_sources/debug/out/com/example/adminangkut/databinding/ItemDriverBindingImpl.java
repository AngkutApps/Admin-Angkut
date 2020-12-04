package com.example.adminangkut.databinding;
import com.example.adminangkut.R;
import com.example.adminangkut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemDriverBindingImpl extends ItemDriverBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_merk, 6);
        sViewsWithIds.put(R.id.textView2, 7);
        sViewsWithIds.put(R.id.textView6, 8);
        sViewsWithIds.put(R.id.textView7, 9);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemDriverBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ItemDriverBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.textView.setTag(null);
        this.textView3.setTag(null);
        this.textView5.setTag(null);
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
        if (BR.pesanan == variableId) {
            setPesanan((com.example.adminangkut.data.model.Driver) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPesanan(@Nullable com.example.adminangkut.data.model.Driver Pesanan) {
        this.mPesanan = Pesanan;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.pesanan);
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
        java.lang.String pesananNoHpUtama = null;
        java.lang.String pesananKursiKosong = null;
        java.lang.String pesananLokasiTerkini = null;
        java.lang.String pesananNamaDriver = null;
        com.example.adminangkut.data.model.Driver pesanan = mPesanan;
        java.lang.String pesananDaerahTujuanDriver = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (pesanan != null) {
                    // read pesanan.noHpUtama
                    pesananNoHpUtama = pesanan.getNoHpUtama();
                    // read pesanan.kursiKosong
                    pesananKursiKosong = pesanan.getKursiKosong();
                    // read pesanan.lokasiTerkini
                    pesananLokasiTerkini = pesanan.getLokasiTerkini();
                    // read pesanan.namaDriver
                    pesananNamaDriver = pesanan.getNamaDriver();
                    // read pesanan.daerahTujuanDriver
                    pesananDaerahTujuanDriver = pesanan.getDaerahTujuanDriver();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, pesananNoHpUtama);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, pesananKursiKosong);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, pesananNamaDriver);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, pesananDaerahTujuanDriver);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, pesananLokasiTerkini);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): pesanan
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}