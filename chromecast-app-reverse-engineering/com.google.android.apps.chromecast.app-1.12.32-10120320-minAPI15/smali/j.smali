.class public Lj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;


# static fields
.field private static final a:Lep;

.field static final e:Ljava/lang/Object;


# instance fields
.field A:Lj;

.field B:I

.field C:I

.field D:Ljava/lang/String;

.field E:Z

.field F:Z

.field public G:Z

.field H:Z

.field I:Z

.field J:Z

.field K:Z

.field L:I

.field M:Landroid/view/ViewGroup;

.field public N:Landroid/view/View;

.field O:Landroid/view/View;

.field P:Z

.field Q:Z

.field R:Lar;

.field S:Z

.field T:Z

.field U:Ljava/lang/Object;

.field V:Ljava/lang/Object;

.field W:Ljava/lang/Object;

.field X:Lax;

.field Y:Lax;

.field private b:Ljava/lang/Object;

.field private c:Ljava/lang/Object;

.field private d:Ljava/lang/Object;

.field f:I

.field g:Landroid/view/View;

.field h:I

.field i:Landroid/os/Bundle;

.field j:Landroid/util/SparseArray;

.field k:I

.field l:Ljava/lang/String;

.field public m:Landroid/os/Bundle;

.field public n:Lj;

.field o:I

.field public p:I

.field q:Z

.field public r:Z

.field public s:Z

.field t:Z

.field u:Z

.field v:Z

.field w:I

.field public x:Lt;

.field public y:Lm;

.field z:Lt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 169
    new-instance v0, Lep;

    invoke-direct {v0}, Lep;-><init>()V

    sput-object v0, Lj;->a:Lep;

    .line 172
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 388
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    const/4 v0, 0x0

    iput v0, p0, Lj;->f:I

    .line 197
    iput v2, p0, Lj;->k:I

    .line 209
    iput v2, p0, Lj;->o:I

    .line 280
    iput-boolean v3, p0, Lj;->J:Z

    .line 302
    iput-boolean v3, p0, Lj;->Q:Z

    .line 308
    iput-object v1, p0, Lj;->b:Ljava/lang/Object;

    .line 309
    sget-object v0, Lj;->e:Ljava/lang/Object;

    iput-object v0, p0, Lj;->U:Ljava/lang/Object;

    .line 310
    iput-object v1, p0, Lj;->c:Ljava/lang/Object;

    .line 311
    sget-object v0, Lj;->e:Ljava/lang/Object;

    iput-object v0, p0, Lj;->V:Ljava/lang/Object;

    .line 312
    iput-object v1, p0, Lj;->d:Ljava/lang/Object;

    .line 313
    sget-object v0, Lj;->e:Ljava/lang/Object;

    iput-object v0, p0, Lj;->W:Ljava/lang/Object;

    .line 317
    iput-object v1, p0, Lj;->X:Lax;

    .line 318
    iput-object v1, p0, Lj;->Y:Lax;

    .line 389
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Lj;
    .locals 1

    .prologue
    .line 396
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lj;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lj;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lj;
    .locals 4

    .prologue
    .line 415
    :try_start_0
    sget-object v0, Lj;->a:Lep;

    invoke-virtual {v0, p1}, Lep;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 416
    if-nez v0, :cond_0

    .line 418
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 419
    sget-object v1, Lj;->a:Lep;

    invoke-virtual {v1, p1, v0}, Lep;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 422
    if-eqz p2, :cond_1

    .line 423
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 424
    iput-object p2, v0, Lj;->m:Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    .line 426
    :cond_1
    return-object v0

    .line 427
    :catch_0
    move-exception v0

    .line 428
    new-instance v1, Ll;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to instantiate fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 431
    :catch_1
    move-exception v0

    .line 432
    new-instance v1, Ll;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to instantiate fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 435
    :catch_2
    move-exception v0

    .line 436
    new-instance v1, Ll;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to instantiate fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method static b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 452
    :try_start_0
    sget-object v0, Lj;->a:Lep;

    invoke-virtual {v0, p1}, Lep;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 453
    if-nez v0, :cond_0

    .line 455
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 456
    sget-object v1, Lj;->a:Lep;

    invoke-virtual {v1, p1, v0}, Lep;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    :cond_0
    const-class v1, Lj;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 460
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static g()V
    .locals 0

    .prologue
    .line 783
    return-void
.end method

.method public static i()Landroid/view/animation/Animation;
    .locals 1

    .prologue
    .line 998
    const/4 v0, 0x0

    return-object v0
.end method

.method public static m()V
    .locals 0

    .prologue
    .line 1287
    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .prologue
    .line 1041
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 642
    invoke-virtual {p0}, Lj;->e()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final varargs a(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 655
    invoke-virtual {p0}, Lj;->e()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 1243
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->K:Z

    .line 1244
    return-void
.end method

.method public a(IILandroid/content/Intent;)V
    .locals 0

    .prologue
    .line 926
    return-void
.end method

.method final a(ILj;)V
    .locals 2

    .prologue
    .line 478
    iput p1, p0, Lj;->k:I

    .line 479
    if-eqz p2, :cond_0

    .line 480
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p2, Lj;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lj;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj;->l:Ljava/lang/String;

    .line 484
    :goto_0
    return-void

    .line 482
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android:fragment:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lj;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj;->l:Ljava/lang/String;

    goto :goto_0
.end method

.method public a(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 991
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->K:Z

    .line 992
    return-void
.end method

.method public final a(Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 894
    iget-object v0, p0, Lj;->y:Lm;

    if-nez v0, :cond_0

    .line 895
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to Activity"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 897
    :cond_0
    iget-object v0, p0, Lj;->y:Lm;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, Lm;->a(Lj;Landroid/content/Intent;I)V

    .line 898
    return-void
.end method

.method public final a(Landroid/content/Intent;I)V
    .locals 3

    .prologue
    .line 905
    iget-object v0, p0, Lj;->y:Lm;

    if-nez v0, :cond_0

    .line 906
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to Activity"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 908
    :cond_0
    iget-object v0, p0, Lj;->y:Lm;

    invoke-virtual {v0, p0, p1, p2}, Lm;->a(Lj;Landroid/content/Intent;I)V

    .line 909
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 1016
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->K:Z

    .line 1017
    return-void
.end method

.method public a(Landroid/view/Menu;)V
    .locals 0

    .prologue
    .line 1277
    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    .prologue
    .line 1260
    return-void
.end method

.method public a(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 1055
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1656
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1657
    iget v0, p0, Lj;->B:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1658
    const-string v0, " mContainerId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1659
    iget v0, p0, Lj;->C:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1660
    const-string v0, " mTag="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lj;->D:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1661
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lj;->f:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 1662
    const-string v0, " mIndex="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lj;->k:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 1663
    const-string v0, " mWho="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lj;->l:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1664
    const-string v0, " mBackStackNesting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lj;->w:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 1665
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->q:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1666
    const-string v0, " mRemoving="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->r:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1667
    const-string v0, " mResumed="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->s:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1668
    const-string v0, " mFromLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->t:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1669
    const-string v0, " mInLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->u:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 1670
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->E:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1671
    const-string v0, " mDetached="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->F:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1672
    const-string v0, " mMenuVisible="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->J:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1673
    const-string v0, " mHasMenu="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->I:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 1674
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->G:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1675
    const-string v0, " mRetaining="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->H:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1676
    const-string v0, " mUserVisibleHint="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lj;->Q:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 1677
    iget-object v0, p0, Lj;->x:Lt;

    if-eqz v0, :cond_0

    .line 1678
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1679
    iget-object v0, p0, Lj;->x:Lt;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1681
    :cond_0
    iget-object v0, p0, Lj;->y:Lm;

    if-eqz v0, :cond_1

    .line 1682
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mActivity="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1683
    iget-object v0, p0, Lj;->y:Lm;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1685
    :cond_1
    iget-object v0, p0, Lj;->A:Lj;

    if-eqz v0, :cond_2

    .line 1686
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1687
    iget-object v0, p0, Lj;->A:Lj;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1689
    :cond_2
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    .line 1690
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1692
    :cond_3
    iget-object v0, p0, Lj;->i:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    .line 1693
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1694
    iget-object v0, p0, Lj;->i:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1696
    :cond_4
    iget-object v0, p0, Lj;->j:Landroid/util/SparseArray;

    if-eqz v0, :cond_5

    .line 1697
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1698
    iget-object v0, p0, Lj;->j:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1700
    :cond_5
    iget-object v0, p0, Lj;->n:Lj;

    if-eqz v0, :cond_6

    .line 1701
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTarget="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lj;->n:Lj;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 1702
    const-string v0, " mTargetRequestCode="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1703
    iget v0, p0, Lj;->p:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 1705
    :cond_6
    iget v0, p0, Lj;->L:I

    if-eqz v0, :cond_7

    .line 1706
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mNextAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lj;->L:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 1708
    :cond_7
    iget-object v0, p0, Lj;->M:Landroid/view/ViewGroup;

    if-eqz v0, :cond_8

    .line 1709
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lj;->M:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1711
    :cond_8
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    if-eqz v0, :cond_9

    .line 1712
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lj;->N:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1714
    :cond_9
    iget-object v0, p0, Lj;->O:Landroid/view/View;

    if-eqz v0, :cond_a

    .line 1715
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mInnerView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lj;->N:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1717
    :cond_a
    iget-object v0, p0, Lj;->g:Landroid/view/View;

    if-eqz v0, :cond_b

    .line 1718
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lj;->g:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1719
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mStateAfterAnimating="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1720
    iget v0, p0, Lj;->h:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 1722
    :cond_b
    iget-object v0, p0, Lj;->R:Lar;

    if-eqz v0, :cond_c

    .line 1723
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loader Manager:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1724
    iget-object v0, p0, Lj;->R:Lar;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, Lar;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 1726
    :cond_c
    iget-object v0, p0, Lj;->z:Lt;

    if-eqz v0, :cond_d

    .line 1727
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Child "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lj;->z:Lt;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1728
    iget-object v0, p0, Lj;->z:Lt;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, Lt;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 1730
    :cond_d
    return-void
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 1308
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 3

    .prologue
    .line 934
    iget-object v0, p0, Lj;->y:Lm;

    invoke-virtual {v0}, Lm;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lj;->y:Lm;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 4677
    iget-object v1, p0, Lj;->z:Lt;

    if-nez v1, :cond_0

    .line 4678
    invoke-virtual {p0}, Lj;->n()V

    .line 4679
    iget v1, p0, Lj;->f:I

    const/4 v2, 0x5

    if-lt v1, v2, :cond_1

    .line 4680
    iget-object v1, p0, Lj;->z:Lt;

    invoke-virtual {v1}, Lt;->m()V

    .line 4689
    :cond_0
    :goto_0
    iget-object v1, p0, Lj;->z:Lt;

    .line 936
    iget-object v1, p0, Lj;->z:Lt;

    invoke-static {v0, v1}, Lfm;->a(Landroid/view/LayoutInflater;Lfs;)V

    .line 937
    return-object v0

    .line 4681
    :cond_1
    iget v1, p0, Lj;->f:I

    const/4 v2, 0x4

    if-lt v1, v2, :cond_2

    .line 4682
    iget-object v1, p0, Lj;->z:Lt;

    invoke-virtual {v1}, Lt;->l()V

    goto :goto_0

    .line 4683
    :cond_2
    iget v1, p0, Lj;->f:I

    const/4 v2, 0x2

    if-lt v1, v2, :cond_3

    .line 4684
    iget-object v1, p0, Lj;->z:Lt;

    invoke-virtual {v1}, Lt;->k()V

    goto :goto_0

    .line 4685
    :cond_3
    iget v1, p0, Lj;->f:I

    if-lez v1, :cond_0

    .line 4686
    iget-object v1, p0, Lj;->z:Lt;

    invoke-virtual {v1}, Lt;->j()V

    goto :goto_0
.end method

.method final b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 1786
    iget-object v0, p0, Lj;->z:Lt;

    if-eqz v0, :cond_0

    .line 1787
    iget-object v0, p0, Lj;->z:Lt;

    .line 5919
    const/4 v1, 0x0

    iput-boolean v1, v0, Lt;->j:Z

    .line 1789
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lj;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final c(Z)V
    .locals 2

    .prologue
    .line 800
    iget-object v0, p0, Lj;->A:Lj;

    if-eqz v0, :cond_0

    .line 801
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t retain fragements that are nested in other fragments"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 804
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->G:Z

    .line 805
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 1188
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->K:Z

    .line 1189
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 1082
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->K:Z

    .line 1083
    return-void
.end method

.method public final d(Z)V
    .locals 1

    .prologue
    .line 819
    iget-boolean v0, p0, Lj;->I:Z

    if-eq v0, p1, :cond_0

    .line 820
    iput-boolean p1, p0, Lj;->I:Z

    .line 821
    invoke-virtual {p0}, Lj;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2762
    iget-boolean v0, p0, Lj;->E:Z

    .line 821
    if-nez v0, :cond_0

    .line 822
    iget-object v0, p0, Lj;->y:Lm;

    invoke-virtual {v0}, Lm;->a_()V

    .line 825
    :cond_0
    return-void
.end method

.method public final e()Landroid/content/res/Resources;
    .locals 3

    .prologue
    .line 619
    iget-object v0, p0, Lj;->y:Lm;

    if-nez v0, :cond_0

    .line 620
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to Activity"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 622
    :cond_0
    iget-object v0, p0, Lj;->y:Lm;

    invoke-virtual {v0}, Lm;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 1150
    return-void
.end method

.method public final e(Z)V
    .locals 1

    .prologue
    .line 837
    iget-boolean v0, p0, Lj;->J:Z

    if-eq v0, p1, :cond_0

    .line 838
    iput-boolean p1, p0, Lj;->J:Z

    .line 839
    iget-boolean v0, p0, Lj;->I:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3762
    iget-boolean v0, p0, Lj;->E:Z

    .line 839
    if-nez v0, :cond_0

    .line 840
    iget-object v0, p0, Lj;->y:Lm;

    invoke-virtual {v0}, Lm;->a_()V

    .line 843
    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 494
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final f(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 548
    iget v0, p0, Lj;->k:I

    if-ltz v0, :cond_0

    .line 549
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment already active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 551
    :cond_0
    iput-object p1, p0, Lj;->m:Landroid/os/Bundle;

    .line 552
    return-void
.end method

.method public final f(Z)V
    .locals 2

    .prologue
    .line 859
    iget-boolean v0, p0, Lj;->Q:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    iget v0, p0, Lj;->f:I

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    .line 860
    iget-object v0, p0, Lj;->x:Lt;

    invoke-virtual {v0, p0}, Lt;->a(Lj;)V

    .line 862
    :cond_0
    iput-boolean p1, p0, Lj;->Q:Z

    .line 863
    if-nez p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lj;->P:Z

    .line 864
    return-void

    .line 863
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 704
    iget-object v0, p0, Lj;->y:Lm;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lj;->q:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final g(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 1936
    invoke-virtual {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 1937
    iget-object v0, p0, Lj;->z:Lt;

    if-eqz v0, :cond_0

    .line 1938
    iget-object v0, p0, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->i()Landroid/os/Parcelable;

    move-result-object v0

    .line 1939
    if-eqz v0, :cond_0

    .line 1940
    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1943
    :cond_0
    return-void
.end method

.method public g_()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 1106
    iput-boolean v1, p0, Lj;->K:Z

    .line 1108
    iget-boolean v0, p0, Lj;->S:Z

    if-nez v0, :cond_1

    .line 1109
    iput-boolean v1, p0, Lj;->S:Z

    .line 1110
    iget-boolean v0, p0, Lj;->T:Z

    if-nez v0, :cond_0

    .line 1111
    iput-boolean v1, p0, Lj;->T:Z

    .line 1112
    iget-object v0, p0, Lj;->y:Lm;

    iget-object v1, p0, Lj;->l:Ljava/lang/String;

    iget-boolean v2, p0, Lj;->S:Z

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lm;->a(Ljava/lang/String;ZZ)Lar;

    move-result-object v0

    iput-object v0, p0, Lj;->R:Lar;

    .line 1114
    :cond_0
    iget-object v0, p0, Lj;->R:Lar;

    if-eqz v0, :cond_1

    .line 1115
    iget-object v0, p0, Lj;->R:Lar;

    invoke-virtual {v0}, Lar;->b()V

    .line 1118
    :cond_1
    return-void
.end method

.method public final h()Lap;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 878
    iget-object v0, p0, Lj;->R:Lar;

    if-eqz v0, :cond_0

    .line 879
    iget-object v0, p0, Lj;->R:Lar;

    .line 886
    :goto_0
    return-object v0

    .line 881
    :cond_0
    iget-object v0, p0, Lj;->y:Lm;

    if-nez v0, :cond_1

    .line 882
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to Activity"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 884
    :cond_1
    iput-boolean v3, p0, Lj;->T:Z

    .line 885
    iget-object v0, p0, Lj;->y:Lm;

    iget-object v1, p0, Lj;->l:Ljava/lang/String;

    iget-boolean v2, p0, Lj;->S:Z

    invoke-virtual {v0, v1, v2, v3}, Lm;->a(Ljava/lang/String;ZZ)Lar;

    move-result-object v0

    iput-object v0, p0, Lj;->R:Lar;

    .line 886
    iget-object v0, p0, Lj;->R:Lar;

    goto :goto_0
.end method

.method public h_()V
    .locals 1

    .prologue
    .line 1171
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->K:Z

    .line 1172
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 501
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public j()V
    .locals 1

    .prologue
    .line 1127
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->K:Z

    .line 1128
    return-void
.end method

.method public k()V
    .locals 1

    .prologue
    .line 1162
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->K:Z

    .line 1163
    return-void
.end method

.method public l()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 1196
    iput-boolean v1, p0, Lj;->K:Z

    .line 1199
    iget-boolean v0, p0, Lj;->T:Z

    if-nez v0, :cond_0

    .line 1200
    iput-boolean v1, p0, Lj;->T:Z

    .line 1201
    iget-object v0, p0, Lj;->y:Lm;

    iget-object v1, p0, Lj;->l:Ljava/lang/String;

    iget-boolean v2, p0, Lj;->S:Z

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lm;->a(Ljava/lang/String;ZZ)Lar;

    move-result-object v0

    iput-object v0, p0, Lj;->R:Lar;

    .line 1203
    :cond_0
    iget-object v0, p0, Lj;->R:Lar;

    if-eqz v0, :cond_1

    .line 1204
    iget-object v0, p0, Lj;->R:Lar;

    invoke-virtual {v0}, Lar;->g()V

    .line 1206
    :cond_1
    return-void
.end method

.method final n()V
    .locals 3

    .prologue
    .line 1743
    new-instance v0, Lt;

    invoke-direct {v0}, Lt;-><init>()V

    iput-object v0, p0, Lj;->z:Lt;

    .line 1744
    iget-object v0, p0, Lj;->z:Lt;

    iget-object v1, p0, Lj;->y:Lm;

    new-instance v2, Lk;

    invoke-direct {v2, p0}, Lk;-><init>(Lj;)V

    invoke-virtual {v0, v1, v2, p0}, Lt;->a(Lm;Lq;Lj;)V

    .line 1759
    return-void
.end method

.method final o()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1970
    iget-object v0, p0, Lj;->z:Lt;

    if-eqz v0, :cond_0

    .line 1971
    iget-object v0, p0, Lj;->z:Lt;

    .line 5956
    const/4 v1, 0x2

    invoke-virtual {v0, v1, v3}, Lt;->a(IZ)V

    .line 1973
    :cond_0
    iget-boolean v0, p0, Lj;->S:Z

    if-eqz v0, :cond_2

    .line 1974
    iput-boolean v3, p0, Lj;->S:Z

    .line 1975
    iget-boolean v0, p0, Lj;->T:Z

    if-nez v0, :cond_1

    .line 1976
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->T:Z

    .line 1977
    iget-object v0, p0, Lj;->y:Lm;

    iget-object v1, p0, Lj;->l:Ljava/lang/String;

    iget-boolean v2, p0, Lj;->S:Z

    invoke-virtual {v0, v1, v2, v3}, Lm;->a(Ljava/lang/String;ZZ)Lar;

    move-result-object v0

    iput-object v0, p0, Lj;->R:Lar;

    .line 1979
    :cond_1
    iget-object v0, p0, Lj;->R:Lar;

    if-eqz v0, :cond_2

    .line 1980
    iget-object v0, p0, Lj;->y:Lm;

    iget-boolean v0, v0, Lm;->d:Z

    if-nez v0, :cond_3

    .line 1981
    iget-object v0, p0, Lj;->R:Lar;

    invoke-virtual {v0}, Lar;->c()V

    .line 1987
    :cond_2
    :goto_0
    return-void

    .line 1983
    :cond_3
    iget-object v0, p0, Lj;->R:Lar;

    invoke-virtual {v0}, Lar;->d()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 1153
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->K:Z

    .line 1154
    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 1339
    .line 5612
    iget-object v0, p0, Lj;->y:Lm;

    .line 1339
    invoke-virtual {v0, p1, p2, p3}, Lm;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 1340
    return-void
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 1175
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj;->K:Z

    .line 1176
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 506
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 507
    invoke-static {p0, v0}, La;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 508
    iget v1, p0, Lj;->k:I

    if-ltz v1, :cond_0

    .line 509
    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    iget v1, p0, Lj;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 512
    :cond_0
    iget v1, p0, Lj;->B:I

    if-eqz v1, :cond_1

    .line 513
    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    iget v1, p0, Lj;->B:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    :cond_1
    iget-object v1, p0, Lj;->D:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 517
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    iget-object v1, p0, Lj;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    :cond_2
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 521
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
