package com.test.codeglo.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R6\u0010\u0007\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/test/codeglo/viewModel/PhotosActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/test/codeglo/repository/Repository;", "networkHelper", "Lcom/test/codeglo/utility/NetworkHelper;", "(Lcom/test/codeglo/repository/Repository;Lcom/test/codeglo/utility/NetworkHelper;)V", "userPhoto", "Landroidx/lifecycle/MutableLiveData;", "Lcom/test/codeglo/utility/Resource;", "Ljava/util/ArrayList;", "Lcom/test/codeglo/model/UserPhoto;", "Lkotlin/collections/ArrayList;", "getUserPhoto", "()Landroidx/lifecycle/MutableLiveData;", "setUserPhoto", "(Landroidx/lifecycle/MutableLiveData;)V", "getPhotos", "", "userId", "", "app_debug"})
public final class PhotosActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.test.codeglo.utility.Resource<java.util.ArrayList<com.test.codeglo.model.UserPhoto>>> userPhoto;
    private final com.test.codeglo.repository.Repository repository = null;
    private final com.test.codeglo.utility.NetworkHelper networkHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.test.codeglo.utility.Resource<java.util.ArrayList<com.test.codeglo.model.UserPhoto>>> getUserPhoto() {
        return null;
    }
    
    public final void setUserPhoto(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.test.codeglo.utility.Resource<java.util.ArrayList<com.test.codeglo.model.UserPhoto>>> p0) {
    }
    
    public final void getPhotos(int userId) {
    }
    
    @javax.inject.Inject()
    public PhotosActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.test.codeglo.repository.Repository repository, @org.jetbrains.annotations.NotNull()
    com.test.codeglo.utility.NetworkHelper networkHelper) {
        super();
    }
}