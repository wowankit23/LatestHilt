package com.test.codeglo.ui.album;

import java.lang.System;

/**
 * Shows list of users
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/test/codeglo/ui/album/AlbumActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/test/codeglo/ui/album/AlbumAdapter$UserViewHolder$OnClickedListener;", "()V", "albumAdapter", "Lcom/test/codeglo/ui/album/AlbumAdapter;", "list", "Ljava/util/ArrayList;", "Lcom/test/codeglo/model/UserAlbum;", "viewModel", "Lcom/test/codeglo/viewModel/AlbumsActivityViewModel;", "init", "", "onClick", "position", "", "model", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showError", "msg", "", "subscribeUi", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AlbumActivity extends androidx.appcompat.app.AppCompatActivity implements com.test.codeglo.ui.album.AlbumAdapter.UserViewHolder.OnClickedListener {
    private final java.util.ArrayList<com.test.codeglo.model.UserAlbum> list = null;
    private com.test.codeglo.viewModel.AlbumsActivityViewModel viewModel;
    private com.test.codeglo.ui.album.AlbumAdapter albumAdapter;
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
    
    @java.lang.Override()
    public void onClick(int position, @org.jetbrains.annotations.NotNull()
    com.test.codeglo.model.UserAlbum model) {
    }
    
    public AlbumActivity() {
        super();
    }
}