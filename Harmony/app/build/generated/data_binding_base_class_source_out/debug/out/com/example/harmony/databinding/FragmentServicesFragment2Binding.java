// Generated by view binder compiler. Do not edit!
package com.example.harmony.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.harmony.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentServicesFragment2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnBook2;

  @NonNull
  public final Button buttonBack4;

  @NonNull
  public final LinearLayout linearLayout9;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView3;

  private FragmentServicesFragment2Binding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnBook2, @NonNull Button buttonBack4, @NonNull LinearLayout linearLayout9,
      @NonNull TextView textView, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.btnBook2 = btnBook2;
    this.buttonBack4 = buttonBack4;
    this.linearLayout9 = linearLayout9;
    this.textView = textView;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentServicesFragment2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentServicesFragment2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_services_fragment2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentServicesFragment2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBook2;
      Button btnBook2 = ViewBindings.findChildViewById(rootView, id);
      if (btnBook2 == null) {
        break missingId;
      }

      id = R.id.buttonBack4;
      Button buttonBack4 = ViewBindings.findChildViewById(rootView, id);
      if (buttonBack4 == null) {
        break missingId;
      }

      id = R.id.linearLayout9;
      LinearLayout linearLayout9 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout9 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new FragmentServicesFragment2Binding((ConstraintLayout) rootView, btnBook2,
          buttonBack4, linearLayout9, textView, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
