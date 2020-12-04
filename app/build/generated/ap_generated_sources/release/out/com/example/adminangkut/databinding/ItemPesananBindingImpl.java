package com.example.adminangkut.databinding;
import com.example.adminangkut.R;
import com.example.adminangkut.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPesananBindingImpl extends ItemPesananBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView2, 5);
        sViewsWithIds.put(R.id.textView4, 6);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPesananBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemPesananBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.textView.setTag(null);
        this.textView3.setTag(null);
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
        java.lang.String pesananNamaUser = null;
        java.lang.String pesananLokPenjemputan = null;
        com.example.adminangkut.data.model.Pesanan pesanan = mPesanan;
        java.lang.String pesananLokTujuan = null;
        java.lang.String pesananNoHpUser = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (pesanan != null) {
                    // read pesanan.namaUser
                    pesananNamaUser = pesanan.getNamaUser();
                    // read pesanan.lokPenjemputan
                    pesananLokPenjemputan = pesanan.getLokPenjemputan();
                    // read pesanan.lokTujuan
                    pesananLokTujuan = pesanan.getLokTujuan();
                    // read pesanan.noHpUser
                    pesananNoHpUser = pesanan.getNoHpUser();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, pesananNoHpUser);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, pesananLokTujuan);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, pesananNamaUser);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, pesananLokPenjemputan);
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