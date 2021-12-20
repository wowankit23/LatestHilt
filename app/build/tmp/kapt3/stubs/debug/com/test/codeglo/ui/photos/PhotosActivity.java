package com.test.codeglo.ui.photos;

import java.lang.System;

/**
 * Shows list of users
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/test/codeglo/ui/photos/PhotosActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "list", "Ljava/util/ArrayList;", "Lcom/test/codeglo/model/UserPhoto;", "photoAdapter", "Lcom/test/codeglo/ui/photos/PhotosAdapter;", "viewModel", "Lcom/test/codeglo/viewModel/PhotosActivityViewModel;", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showError", "msg", "", "subscribeUi", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PhotosActivity extends androidx.appcompat.app.AppCompatActivity {
    private final java.util.ArrayList<com.test.codeglo.model.UserPhoto> list = null;
    private com.test.codeglo.viewModel.PhotosActivityViewModel viewModel;
    private com.test.codeglo.ui.photos.PhotosAdapter photoAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void subscribeUi() {
    }
    
    private final void showError(java.lang.String msg) {
    }
    
    public PhotosActivity() {
        super();
    }
}