// Generated by view binder compiler. Do not edit!
package com.example.inventory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.inventory.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UserListFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CheckBox checkAttack;

  @NonNull
  public final CheckBox checkDefence;

  @NonNull
  public final CheckBox checkHp;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final TextView note;

  @NonNull
  public final TextView noteOfSorting;

  @NonNull
  public final CircularProgressIndicator progressBar;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final MaterialButton shuffleButton;

  private UserListFragmentBinding(@NonNull ConstraintLayout rootView, @NonNull CheckBox checkAttack,
      @NonNull CheckBox checkDefence, @NonNull CheckBox checkHp,
      @NonNull ConstraintLayout container, @NonNull TextView note, @NonNull TextView noteOfSorting,
      @NonNull CircularProgressIndicator progressBar, @NonNull RecyclerView recyclerView,
      @NonNull MaterialButton shuffleButton) {
    this.rootView = rootView;
    this.checkAttack = checkAttack;
    this.checkDefence = checkDefence;
    this.checkHp = checkHp;
    this.container = container;
    this.note = note;
    this.noteOfSorting = noteOfSorting;
    this.progressBar = progressBar;
    this.recyclerView = recyclerView;
    this.shuffleButton = shuffleButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UserListFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UserListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.user_list_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UserListFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.check_attack;
      CheckBox checkAttack = rootView.findViewById(id);
      if (checkAttack == null) {
        break missingId;
      }

      id = R.id.check_defence;
      CheckBox checkDefence = rootView.findViewById(id);
      if (checkDefence == null) {
        break missingId;
      }

      id = R.id.check_hp;
      CheckBox checkHp = rootView.findViewById(id);
      if (checkHp == null) {
        break missingId;
      }

      id = R.id.container;
      ConstraintLayout container = rootView.findViewById(id);
      if (container == null) {
        break missingId;
      }

      id = R.id.note;
      TextView note = rootView.findViewById(id);
      if (note == null) {
        break missingId;
      }

      id = R.id.note_of_sorting;
      TextView noteOfSorting = rootView.findViewById(id);
      if (noteOfSorting == null) {
        break missingId;
      }

      id = R.id.progressBar;
      CircularProgressIndicator progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = rootView.findViewById(id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.shuffle_button;
      MaterialButton shuffleButton = rootView.findViewById(id);
      if (shuffleButton == null) {
        break missingId;
      }

      return new UserListFragmentBinding((ConstraintLayout) rootView, checkAttack, checkDefence,
          checkHp, container, note, noteOfSorting, progressBar, recyclerView, shuffleButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
