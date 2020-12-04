// Generated by data binding compiler. Do not edit!
package com.example.adminangkut.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.adminangkut.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBiayaBinding extends ViewDataBinding {
  @NonNull
  public final Button btnUpdate;

  @NonNull
  public final EditText etBiaya;

  @NonNull
  public final Spinner spJemput;

  @NonNull
  public final Spinner spTujuan;

  protected FragmentBiayaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnUpdate, EditText etBiaya, Spinner spJemput, Spinner spTujuan) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnUpdate = btnUpdate;
    this.etBiaya = etBiaya;
    this.spJemput = spJemput;
    this.spTujuan = spTujuan;
  }

  @NonNull
  public static FragmentBiayaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_biaya, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBiayaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBiayaBinding>inflateInternal(inflater, R.layout.fragment_biaya, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBiayaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_biaya, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBiayaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBiayaBinding>inflateInternal(inflater, R.layout.fragment_biaya, null, false, component);
  }

  public static FragmentBiayaBinding bind(@NonNull View view) {
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
  public static FragmentBiayaBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBiayaBinding)bind(component, view, R.layout.fragment_biaya);
  }
}