package com.example.adminangkut.databinding;
import com.example.adminangkut.R;
import com.example.adminangkut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailBindingImpl extends ActivityDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView2, 10);
        sViewsWithIds.put(R.id.rl_cari_driver, 11);
        sViewsWithIds.put(R.id.rl_driver_select, 12);
        sViewsWithIds.put(R.id.tv_driver, 13);
        sViewsWithIds.put(R.id.btn_update, 14);
        sViewsWithIds.put(R.id.btn_cari_driver, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[14]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[10]
            , (android.widget.TextView) bindings[13]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
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
            setPesanan((com.example.adminangkut.data.model.Pesanan) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPesanan(@Nullable com.example.adminangkut.data.model.Pesanan Pesanan) {
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
        java.lang.String pesananBiaya = null;
        java.lang.String pesananLokTujuan = null;
        java.lang.String pesananKeberangkatan = null;
        java.lang.String pesananNoHpUser = null;
        java.lang.String pesananNamaUser = null;
        java.lang.String pesananLokPenjemputan = null;
        java.lang.String pesananPenumpangDewasa = null;
        com.example.adminangkut.data.model.Pesanan pesanan = mPesanan;
        java.lang.String pesananPenumpangAnak = null;
        java.lang.String pesananBarangBawaan = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (pesanan != null) {
                    // read pesanan.biaya
                    pesananBiaya = pesanan.getBiaya();
                    // read pesanan.lokTujuan
                    pesananLokTujuan = pesanan.getLokTujuan();
                    // read pesanan.keberangkatan
                    pesananKeberangkatan = pesanan.getKeberangkatan();
                    // read pesanan.noHpUser
                    pesananNoHpUser = pesanan.getNoHpUser();
                    // read pesanan.namaUser
                    pesananNamaUser = pesanan.getNamaUser();
                    // read pesanan.lokPenjemputan
                    pesananLokPenjemputan = pesanan.getLokPenjemputan();
                    // read pesanan.penumpangDewasa
                    pesananPenumpangDewasa = pesanan.getPenumpangDewasa();
                    // read pesanan.penumpangAnak
                    pesananPenumpangAnak = pesanan.getPenumpangAnak();
                    // read pesanan.barangBawaan
                    pesananBarangBawaan = pesanan.getBarangBawaan();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, pesananNamaUser);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, pesananNoHpUser);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, pesananLokPenjemputan);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, pesananLokTujuan);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, pesananPenumpangDewasa);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, pesananPenumpangAnak);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, pesananBarangBawaan);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, pesananBiaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, pesananKeberangkatan);
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