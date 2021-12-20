package com.test.codeglo.ui.photos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u001e\u0010\u0014\u001a\u00020\r2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/test/codeglo/ui/photos/PhotosAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/test/codeglo/ui/photos/PhotosAdapter$UserViewHolder;", "context", "Landroid/content/Context;", "list", "Ljava/util/ArrayList;", "Lcom/test/codeglo/model/UserPhoto;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "userList", "UserViewHolder", "app_debug"})
public final class PhotosAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.test.codeglo.ui.photos.PhotosAdapter.UserViewHolder> {
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.test.codeglo.model.UserPhoto> list = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.test.codeglo.ui.photos.PhotosAdapter.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.test.codeglo.ui.photos.PhotosAdapter.UserViewHolder holder, int position) {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.test.codeglo.model.UserPhoto> userList) {
    }
    
    public PhotosAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.test.codeglo.model.UserPhoto> list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/test/codeglo/ui/photos/PhotosAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "bind", "", "item", "Lcom/test/codeglo/model/UserPhoto;", "app_debug"})
    public static final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.content.Context context = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.test.codeglo.model.UserPhoto item) {
        }
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}