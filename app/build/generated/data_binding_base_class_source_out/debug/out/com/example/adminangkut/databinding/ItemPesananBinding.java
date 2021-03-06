// Generated by data binding compiler. Do not edit!
package com.example.adminangkut.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.adminangkut.R;
import com.example.adminangkut.data.model.Pesanan;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemPesananBinding extends ViewDataBinding {
  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @Bindable
  protected Pesanan mPesanan;

  protected ItemPesananBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView textView, TextView textView2, TextView textView3, TextView textView4) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
  }

  public abstract void setPesanan(@Nullable Pesanan pesanan);

  @Nullable
  public Pesanan getPesanan() {
    return mPesanan;
  }

  @NonNull
  public static ItemPesananBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pesanan, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPesananBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPesananBinding>inflateInternal(inflater, R.layout.item_pesanan, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPesananBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pesanan, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPesananBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPesananBinding>inflateInternal(inflater, R.layout.item_pesanan, null, false, component);
  }

  public static ItemPesananBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemPesananBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemPesananBinding)bind(component, view, R.layout.item_pesanan);
  }
}
