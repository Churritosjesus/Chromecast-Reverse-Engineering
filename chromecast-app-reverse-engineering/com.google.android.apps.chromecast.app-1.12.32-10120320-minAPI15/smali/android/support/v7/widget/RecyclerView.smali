.class public Landroid/support/v7/widget/RecyclerView;
.super Landroid/view/ViewGroup;
.source "PG"

# interfaces
.implements Lgi;
.implements Lgo;


# static fields
.field private static final ai:Landroid/view/animation/Interpolator;

.field private static final s:Z

.field private static final t:[Ljava/lang/Class;


# instance fields
.field private final A:Ljava/util/ArrayList;

.field private B:Ls;

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:I

.field private G:Z

.field private final H:Z

.field private final I:Landroid/view/accessibility/AccessibilityManager;

.field private J:I

.field private K:I

.field private L:I

.field private M:Landroid/view/VelocityTracker;

.field private N:I

.field private O:I

.field private P:I

.field private Q:I

.field private R:I

.field private final S:I

.field private final T:I

.field private U:F

.field private final V:Lzq;

.field private W:Lzd;

.field public final a:Lzl;

.field private aa:Z

.field private ab:Lzs;

.field private final ac:[I

.field private final ad:Lgj;

.field private final ae:[I

.field private final af:[I

.field private final ag:[I

.field private ah:Ljava/lang/Runnable;

.field public b:Lwh;

.field public c:Lxb;

.field public d:Lyz;

.field public e:Lzh;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Llc;

.field public j:Llc;

.field public k:Llc;

.field public l:Llc;

.field public m:Lzc;

.field public final n:Lzp;

.field public o:Lzj;

.field public p:Ljava/util/List;

.field public q:Z

.field public r:Z

.field private final u:Lzm;

.field private v:Lzn;

.field private w:Z

.field private final x:Ljava/lang/Runnable;

.field private final y:Landroid/graphics/Rect;

.field private final z:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 152
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x12

    if-eq v0, v3, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-eq v0, v3, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x14

    if-ne v0, v3, :cond_1

    :cond_0
    move v0, v2

    :goto_0
    sput-boolean v0, Landroid/support/v7/widget/RecyclerView;->s:Z

    .line 231
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Class;

    const-class v3, Landroid/content/Context;

    aput-object v3, v0, v1

    const-class v1, Landroid/util/AttributeSet;

    aput-object v1, v0, v2

    const/4 v1, 0x2

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    sput-object v0, Landroid/support/v7/widget/RecyclerView;->t:[Ljava/lang/Class;

    .line 392
    new-instance v0, Lyw;

    invoke-direct {v0}, Lyw;-><init>()V

    sput-object v0, Landroid/support/v7/widget/RecyclerView;->ai:Landroid/view/animation/Interpolator;

    return-void

    :cond_1
    move v0, v1

    .line 152
    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 400
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 401
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 404
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 405
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .prologue
    const/16 v5, 0x2e

    const/4 v4, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 408
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 234
    new-instance v0, Lzm;

    .line 9965
    invoke-direct {v0, p0}, Lzm;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 234
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Lzm;

    .line 236
    new-instance v0, Lzl;

    invoke-direct {v0, p0}, Lzl;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 256
    new-instance v0, Lyu;

    invoke-direct {v0, p0}, Lyu;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Ljava/lang/Runnable;

    .line 281
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    .line 285
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    .line 286
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->A:Ljava/util/ArrayList;

    .line 305
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->h:Z

    .line 315
    iput v2, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    .line 319
    new-instance v0, Lxe;

    invoke-direct {v0}, Lxe;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    .line 344
    iput v2, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    .line 345
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 355
    const/4 v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->U:F

    .line 357
    new-instance v0, Lzq;

    invoke-direct {v0, p0}, Lzq;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->V:Lzq;

    .line 359
    new-instance v0, Lzp;

    invoke-direct {v0}, Lzp;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 365
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->q:Z

    .line 366
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->r:Z

    .line 367
    new-instance v0, Lze;

    .line 10273
    invoke-direct {v0, p0}, Lze;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 367
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Lzd;

    .line 369
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->aa:Z

    .line 375
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ac:[I

    .line 378
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    .line 379
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:[I

    .line 380
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    .line 382
    new-instance v0, Lyv;

    invoke-direct {v0, p0}, Lyv;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ah:Ljava/lang/Runnable;

    .line 409
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->setFocusableInTouchMode(Z)V

    .line 410
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 411
    const/16 v3, 0x10

    if-lt v0, v3, :cond_2

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Z

    .line 413
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 414
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    iput v3, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    .line 415
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v3

    iput v3, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    .line 416
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    .line 417
    invoke-static {p0}, Lgt;->a(Landroid/view/View;)I

    move-result v0

    if-ne v0, v4, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->setWillNotDraw(Z)V

    .line 419
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->W:Lzd;

    .line 10485
    iput-object v3, v0, Lzc;->h:Lzd;

    .line 10614
    new-instance v0, Lwh;

    new-instance v3, Lyy;

    invoke-direct {v3, p0}, Lyy;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    invoke-direct {v0, v3}, Lwh;-><init>(Lwi;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    .line 11530
    new-instance v0, Lxb;

    new-instance v3, Lyx;

    invoke-direct {v3, p0}, Lyx;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    invoke-direct {v0, v3}, Lxb;-><init>(Lxd;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    .line 423
    invoke-static {p0}, Lgt;->e(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_0

    .line 425
    invoke-static {p0, v1}, Lgt;->c(Landroid/view/View;I)V

    .line 428
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v3, "accessibility"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/view/accessibility/AccessibilityManager;

    .line 430
    new-instance v0, Lzs;

    invoke-direct {v0, p0}, Lzs;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 12459
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ab:Lzs;

    .line 12460
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ab:Lzs;

    invoke-static {p0, v0}, Lgt;->a(Landroid/view/View;Ler;)V

    .line 432
    if-eqz p2, :cond_1

    .line 434
    sget-object v0, Lvq;->a:[I

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 436
    sget v3, Lvq;->b:I

    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 437
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 12468
    if-eqz v3, :cond_1

    .line 12469
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 12470
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    .line 12520
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v5, :cond_4

    .line 12521
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 12474
    :goto_2
    :try_start_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 12476
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 12480
    :goto_3
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v3, Lzh;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_6

    move-result-object v5

    .line 12483
    const/4 v3, 0x0

    .line 12485
    :try_start_1
    sget-object v0, Landroid/support/v7/widget/RecyclerView;->t:[Ljava/lang/Class;

    invoke-virtual {v5, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    .line 12487
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v0, v6

    const/4 v6, 0x1

    aput-object p2, v0, v6

    const/4 v6, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v0, v6

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v0, v6
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_6

    move-object v3, v4

    .line 12497
    :goto_4
    const/4 v4, 0x1

    :try_start_2
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 12498
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzh;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_6

    .line 441
    :cond_1
    new-instance v0, Lgj;

    invoke-direct {v0, p0}, Lgj;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Lgj;

    .line 442
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 443
    return-void

    :cond_2
    move v0, v2

    .line 411
    goto/16 :goto_0

    :cond_3
    move v0, v2

    .line 417
    goto/16 :goto_1

    .line 12523
    :cond_4
    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v2, v0

    .line 12524
    goto :goto_2

    .line 12526
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-class v3, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v3}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto :goto_2

    .line 12478
    :cond_6
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_6

    move-result-object v0

    goto :goto_3

    .line 12488
    :catch_0
    move-exception v0

    .line 12490
    const/4 v4, 0x0

    :try_start_4
    new-array v4, v4, [Ljava/lang/Class;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_4} :catch_6

    move-result-object v0

    move-object v8, v3

    move-object v3, v0

    move-object v0, v8

    .line 12495
    goto :goto_4

    .line 12491
    :catch_1
    move-exception v1

    .line 12492
    :try_start_5
    invoke-virtual {v1, v0}, Ljava/lang/NoSuchMethodException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 12493
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Error creating LayoutManager "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_5 .. :try_end_5} :catch_6

    .line 12499
    :catch_2
    move-exception v0

    .line 12500
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Unable to find LayoutManager "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 12502
    :catch_3
    move-exception v0

    .line 12503
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Could not instantiate the LayoutManager: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 12505
    :catch_4
    move-exception v0

    .line 12506
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Could not instantiate the LayoutManager: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 12508
    :catch_5
    move-exception v0

    .line 12509
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Cannot access non-public constructor "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 12511
    :catch_6
    move-exception v0

    .line 12512
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Class is not a LayoutManager "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static synthetic a(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .prologue
    .line 139
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView;->detachViewFromParent(I)V

    return-void
.end method

.method public static synthetic a(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->d(II)V

    return-void
.end method

.method public static synthetic a(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 139
    .line 50305
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    .line 139
    return-void
.end method

.method public static synthetic a(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .prologue
    .line 139
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 4

    .prologue
    const/high16 v3, 0x3f000000    # 0.5f

    .line 2274
    invoke-static {p1}, Lgd;->b(Landroid/view/MotionEvent;)I

    move-result v0

    .line 2275
    invoke-static {p1, v0}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v1

    iget v2, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    if-ne v1, v2, :cond_0

    .line 2277
    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 2278
    :goto_0
    invoke-static {p1, v0}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 2279
    invoke-static {p1, v0}, Lgd;->c(Landroid/view/MotionEvent;I)F

    move-result v1

    add-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2280
    invoke-static {p1, v0}, Lgd;->d(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v3

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    .line 2282
    :cond_0
    return-void

    .line 2277
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Led;)V
    .locals 8

    .prologue
    .line 2900
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v7, v0, Lzp;->e:Ljava/util/List;

    .line 2901
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v6, v0

    :goto_0
    if-ltz v6, :cond_5

    .line 2902
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    .line 2903
    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v1

    .line 2904
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->b:Led;

    invoke-virtual {v0, v1}, Led;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzg;

    .line 2905
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50116
    iget-boolean v2, v2, Lzp;->j:Z

    .line 2905
    if-nez v2, :cond_0

    .line 2906
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v2, v2, Lzp;->c:Led;

    invoke-virtual {v2, v1}, Led;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2908
    :cond_0
    invoke-virtual {p1, v5}, Led;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 2909
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 50120
    iget-object v0, v0, Lzh;->d:Lxb;

    .line 50122
    iget-object v2, v0, Lxb;->a:Lxd;

    invoke-interface {v2, v5}, Lxd;->a(Landroid/view/View;)I

    move-result v2

    .line 50123
    if-ltz v2, :cond_2

    .line 50126
    iget-object v3, v0, Lxb;->b:Lxc;

    invoke-virtual {v3, v2}, Lxc;->c(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 50127
    iget-object v3, v0, Lxb;->c:Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 50129
    :cond_1
    iget-object v0, v0, Lxb;->a:Lxd;

    invoke-interface {v0, v2}, Lxd;->a(I)V

    .line 50118
    :cond_2
    invoke-virtual {v1, v5}, Lzl;->a(Landroid/view/View;)V

    .line 2901
    :goto_1
    add-int/lit8 v0, v6, -0x1

    move v6, v0

    goto :goto_0

    .line 2912
    :cond_3
    if-eqz v0, :cond_4

    .line 2913
    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Lzg;)V

    goto :goto_1

    .line 2916
    :cond_4
    new-instance v0, Lzg;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lzg;-><init>(Lzr;IIII)V

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Lzg;)V

    goto :goto_1

    .line 2920
    :cond_5
    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 2921
    return-void
.end method

.method private a(Lzg;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 2950
    iget-object v0, p1, Lzg;->a:Lzr;

    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    .line 2951
    iget-object v1, p1, Lzg;->a:Lzr;

    invoke-direct {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lzr;)V

    .line 2952
    iget v2, p1, Lzg;->b:I

    .line 2953
    iget v3, p1, Lzg;->c:I

    .line 2954
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v4

    .line 2955
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v5

    .line 2956
    iget-object v1, p1, Lzg;->a:Lzr;

    invoke-virtual {v1}, Lzr;->n()Z

    move-result v1

    if-nez v1, :cond_2

    if-ne v2, v4, :cond_0

    if-eq v3, v5, :cond_2

    .line 2957
    :cond_0
    iget-object v1, p1, Lzg;->a:Lzr;

    invoke-virtual {v1, v6}, Lzr;->a(Z)V

    .line 2958
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v1, v4

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v6, v5

    invoke-virtual {v0, v4, v5, v1, v6}, Landroid/view/View;->layout(IIII)V

    .line 2965
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    iget-object v1, p1, Lzg;->a:Lzr;

    invoke-virtual/range {v0 .. v5}, Lzc;->a(Lzr;IIII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2967
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    .line 2979
    :cond_1
    :goto_0
    return-void

    .line 2974
    :cond_2
    iget-object v0, p1, Lzg;->a:Lzr;

    invoke-virtual {v0, v6}, Lzr;->a(Z)V

    .line 2975
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    iget-object v1, p1, Lzg;->a:Lzr;

    invoke-virtual {v0, v1}, Lzc;->a(Lzr;)Z

    .line 2976
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    goto :goto_0
.end method

.method private a(Lzr;)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v1, 0x1

    .line 998
    iget-object v2, p1, Lzr;->a:Landroid/view/View;

    .line 999
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_0

    move v0, v1

    .line 1000
    :goto_0
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    invoke-virtual {p0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Lzr;

    move-result-object v4

    invoke-virtual {v3, v4}, Lzl;->b(Lzr;)V

    .line 1001
    invoke-virtual {p1}, Lzr;->o()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1003
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-virtual {v0, v2, v5, v3, v1}, Lxb;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 1009
    :goto_1
    return-void

    .line 999
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 1004
    :cond_1
    if-nez v0, :cond_2

    .line 1005
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    .line 20061
    invoke-virtual {v0, v2, v5, v1}, Lxb;->a(Landroid/view/View;IZ)V

    goto :goto_1

    .line 1007
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    .line 20301
    iget-object v1, v0, Lxb;->a:Lxd;

    invoke-interface {v1, v2}, Lxd;->a(Landroid/view/View;)I

    move-result v1

    .line 20302
    if-gez v1, :cond_3

    .line 20303
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "view is not a child, cannot hide "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 20308
    :cond_3
    iget-object v3, v0, Lxb;->b:Lxc;

    invoke-virtual {v3, v1}, Lxc;->a(I)V

    .line 20309
    iget-object v0, v0, Lxb;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method private a(IILandroid/view/MotionEvent;)Z
    .locals 11

    .prologue
    .line 1350
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 1351
    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 1353
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->k()V

    .line 1354
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    if-eqz v4, :cond_6

    .line 1355
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->a()V

    .line 1356
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->q()V

    .line 1357
    const-string v4, "RV Scroll"

    invoke-static {v4}, La;->a(Ljava/lang/String;)V

    .line 1358
    if-eqz p1, :cond_0

    .line 1359
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v2, p1, v3, v4}, Lzh;->a(ILzl;Lzp;)I

    move-result v2

    .line 1360
    sub-int v3, p1, v2

    .line 1362
    :cond_0
    if-eqz p2, :cond_1

    .line 1363
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, p2, v1, v4}, Lzh;->b(ILzl;Lzp;)I

    move-result v0

    .line 1364
    sub-int v1, p2, v0

    .line 1366
    :cond_1
    invoke-static {}, La;->b()V

    .line 1367
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->g()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 1369
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v4}, Lxb;->a()I

    move-result v6

    .line 1370
    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v6, :cond_5

    .line 1371
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v4, v5}, Lxb;->b(I)Landroid/view/View;

    move-result-object v7

    .line 1372
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Lzr;

    move-result-object v4

    .line 1373
    if-eqz v4, :cond_3

    iget-object v8, v4, Lzr;->h:Lzr;

    if-eqz v8, :cond_3

    .line 1374
    iget-object v4, v4, Lzr;->h:Lzr;

    .line 1375
    if-eqz v4, :cond_4

    iget-object v4, v4, Lzr;->a:Landroid/view/View;

    .line 1376
    :goto_1
    if-eqz v4, :cond_3

    .line 1377
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v8

    .line 1378
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v7

    .line 1379
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v9

    if-ne v8, v9, :cond_2

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v9

    if-eq v7, v9, :cond_3

    .line 1380
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v9

    add-int/2addr v9, v8

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v10

    add-int/2addr v10, v7

    invoke-virtual {v4, v8, v7, v9, v10}, Landroid/view/View;->layout(IIII)V

    .line 1370
    :cond_3
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    goto :goto_0

    .line 1375
    :cond_4
    const/4 v4, 0x0

    goto :goto_1

    .line 1388
    :cond_5
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->r()V

    .line 1389
    const/4 v4, 0x0

    invoke-virtual {p0, v4}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    :cond_6
    move v4, v1

    move v1, v2

    move v2, v0

    .line 1391
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1392
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 1395
    :cond_7
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedScroll(IIII[I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1397
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    const/4 v4, 0x0

    aget v3, v3, v4

    sub-int/2addr v0, v3

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    .line 1398
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    sub-int/2addr v0, v3

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    .line 1399
    if-eqz p3, :cond_8

    .line 1400
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    const/4 v3, 0x0

    aget v0, v0, v3

    int-to-float v0, v0

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    int-to-float v3, v3

    invoke-virtual {p3, v0, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 1402
    :cond_8
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    const/4 v3, 0x0

    aget v4, v0, v3

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    const/4 v6, 0x0

    aget v5, v5, v6

    add-int/2addr v4, v5

    aput v4, v0, v3

    .line 1403
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    const/4 v3, 0x1

    aget v4, v0, v3

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    const/4 v6, 0x1

    aget v5, v5, v6

    add-int/2addr v4, v5

    aput v4, v0, v3

    .line 1410
    :cond_9
    :goto_2
    if-nez v1, :cond_a

    if-eqz v2, :cond_b

    .line 1411
    :cond_a
    invoke-virtual {p0, v1, v2}, Landroid/support/v7/widget/RecyclerView;->c(II)V

    .line 1413
    :cond_b
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->awakenScrollBars()Z

    move-result v0

    if-nez v0, :cond_c

    .line 1414
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 1416
    :cond_c
    if-nez v1, :cond_d

    if-eqz v2, :cond_15

    :cond_d
    const/4 v0, 0x1

    :goto_3
    return v0

    .line 1404
    :cond_e
    invoke-static {p0}, Lgt;->a(Landroid/view/View;)I

    move-result v0

    const/4 v5, 0x2

    if-eq v0, v5, :cond_9

    .line 1405
    if-eqz p3, :cond_12

    .line 1406
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    int-to-float v3, v3

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    int-to-float v4, v4

    .line 21680
    const/4 v0, 0x0

    .line 21681
    const/4 v7, 0x0

    cmpg-float v7, v3, v7

    if-gez v7, :cond_13

    .line 21682
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->b()V

    .line 21683
    iget-object v7, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    neg-float v8, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v8, v9

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v10

    int-to-float v10, v10

    div-float/2addr v6, v10

    sub-float v6, v9, v6

    invoke-virtual {v7, v8, v6}, Llc;->a(FF)Z

    move-result v6

    if-eqz v6, :cond_f

    .line 21684
    const/4 v0, 0x1

    .line 21693
    :cond_f
    :goto_4
    const/4 v6, 0x0

    cmpg-float v6, v4, v6

    if-gez v6, :cond_14

    .line 21694
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 21695
    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    neg-float v7, v4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v7, v8

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v5, v8

    invoke-virtual {v6, v7, v5}, Llc;->a(FF)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 21696
    const/4 v0, 0x1

    .line 21705
    :cond_10
    :goto_5
    if-nez v0, :cond_11

    const/4 v0, 0x0

    cmpl-float v0, v3, v0

    if-nez v0, :cond_11

    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-eqz v0, :cond_12

    .line 21706
    :cond_11
    invoke-static {p0}, Lgt;->d(Landroid/view/View;)V

    .line 1408
    :cond_12
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->d(II)V

    goto :goto_2

    .line 21686
    :cond_13
    const/4 v7, 0x0

    cmpl-float v7, v3, v7

    if-lez v7, :cond_f

    .line 21687
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->c()V

    .line 21688
    iget-object v7, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float v8, v3, v8

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v6, v9

    invoke-virtual {v7, v8, v6}, Llc;->a(FF)Z

    move-result v6

    if-eqz v6, :cond_f

    .line 21689
    const/4 v0, 0x1

    goto :goto_4

    .line 21698
    :cond_14
    const/4 v6, 0x0

    cmpl-float v6, v4, v6

    if-lez v6, :cond_10

    .line 21699
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->e()V

    .line 21700
    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float v7, v4, v7

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v5, v9

    sub-float v5, v8, v5

    invoke-virtual {v6, v7, v5}, Llc;->a(FF)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 21701
    const/4 v0, 0x1

    goto :goto_5

    .line 1416
    :cond_15
    const/4 v0, 0x0

    goto/16 :goto_3
.end method

.method public static synthetic a(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    return v0
.end method

.method public static synthetic a(Landroid/support/v7/widget/RecyclerView;Z)Z
    .locals 1

    .prologue
    .line 139
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Z

    return v0
.end method

.method private b(Lzr;)J
    .locals 2

    .prologue
    .line 2892
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    iget v0, p1, Lzr;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public static b(Landroid/view/View;)Lzr;
    .locals 1

    .prologue
    .line 3378
    if-nez p0, :cond_0

    .line 3379
    const/4 v0, 0x0

    .line 3381
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    iget-object v0, v0, Lzi;->c:Lzr;

    goto :goto_0
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 1103
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-ne p1, v0, :cond_1

    .line 1115
    :cond_0
    return-void

    .line 1110
    :cond_1
    iput p1, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    .line 1111
    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    .line 1112
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->m()V

    .line 20705
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Lzj;

    if-eqz v0, :cond_3

    .line 20706
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Lzj;

    invoke-virtual {v0, p1}, Lzj;->a(I)V

    .line 20708
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 20709
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 20710
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzj;

    invoke-virtual {v0, p1}, Lzj;->a(I)V

    .line 20709
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0
.end method

.method public static synthetic b(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    return-void
.end method

.method public static synthetic b(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 139
    .line 50318
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    .line 139
    return-void
.end method

.method public static synthetic b(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->h:Z

    return v0
.end method

.method public static synthetic b(Landroid/support/v7/widget/RecyclerView;Z)Z
    .locals 1

    .prologue
    .line 139
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Z

    return v0
.end method

.method public static synthetic c(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    return v0
.end method

.method public static synthetic c(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 139
    .line 50351
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->a()V

    .line 50352
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    .line 50363
    iget-object v3, v2, Lxb;->a:Lxd;

    invoke-interface {v3, p1}, Lxd;->a(Landroid/view/View;)I

    move-result v3

    .line 50364
    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 50365
    iget-object v2, v2, Lxb;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 50353
    :goto_0
    if-eqz v0, :cond_0

    .line 50354
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v2

    .line 50355
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    invoke-virtual {v3, v2}, Lzl;->b(Lzr;)V

    .line 50356
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    invoke-virtual {v3, v2}, Lzl;->a(Lzr;)V

    .line 50361
    :cond_0
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 139
    return v0

    .line 50370
    :cond_1
    iget-object v4, v2, Lxb;->b:Lxc;

    invoke-virtual {v4, v3}, Lxc;->b(I)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 50371
    iget-object v4, v2, Lxb;->b:Lxc;

    invoke-virtual {v4, v3}, Lxc;->c(I)Z

    .line 50372
    iget-object v4, v2, Lxb;->c:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 50376
    iget-object v2, v2, Lxb;->a:Lxd;

    invoke-interface {v2, v3}, Lxd;->a(I)V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 50379
    goto :goto_0
.end method

.method public static synthetic d(Landroid/support/v7/widget/RecyclerView;)Lzh;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    return-object v0
.end method

.method private d(II)V
    .locals 2

    .prologue
    .line 1722
    const/4 v0, 0x0

    .line 1723
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    invoke-virtual {v1}, Llc;->a()Z

    move-result v1

    if-nez v1, :cond_0

    if-lez p1, :cond_0

    .line 1724
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    invoke-virtual {v0}, Llc;->c()Z

    move-result v0

    .line 1726
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    invoke-virtual {v1}, Llc;->a()Z

    move-result v1

    if-nez v1, :cond_1

    if-gez p1, :cond_1

    .line 1727
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    invoke-virtual {v1}, Llc;->c()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1729
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    invoke-virtual {v1}, Llc;->a()Z

    move-result v1

    if-nez v1, :cond_2

    if-lez p2, :cond_2

    .line 1730
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    invoke-virtual {v1}, Llc;->c()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1732
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    invoke-virtual {v1}, Llc;->a()Z

    move-result v1

    if-nez v1, :cond_3

    if-gez p2, :cond_3

    .line 1733
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    invoke-virtual {v1}, Llc;->c()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1735
    :cond_3
    if-eqz v0, :cond_4

    .line 1736
    invoke-static {p0}, Lgt;->d(Landroid/view/View;)V

    .line 1738
    :cond_4
    return-void
.end method

.method private e(II)V
    .locals 4

    .prologue
    .line 2374
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 2375
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 2376
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 2377
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 2382
    sparse-switch v2, :sswitch_data_0

    .line 2389
    invoke-static {p0}, Lgt;->m(Landroid/view/View;)I

    move-result v1

    .line 2393
    :sswitch_0
    sparse-switch v3, :sswitch_data_1

    .line 2400
    invoke-static {p0}, Lgt;->n(Landroid/view/View;)I

    move-result v0

    .line 2404
    :sswitch_1
    invoke-virtual {p0, v1, v0}, Landroid/support/v7/widget/RecyclerView;->setMeasuredDimension(II)V

    .line 2405
    return-void

    .line 2382
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x40000000 -> :sswitch_0
    .end sparse-switch

    .line 2393
    :sswitch_data_1
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x40000000 -> :sswitch_1
    .end sparse-switch
.end method

.method public static synthetic e(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->k()V

    return-void
.end method

.method public static synthetic f(Landroid/support/v7/widget/RecyclerView;)Lyz;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    return-object v0
.end method

.method private f(II)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 2855
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v2}, Lxb;->a()I

    move-result v3

    .line 2856
    if-nez v3, :cond_2

    .line 2857
    if-nez p1, :cond_0

    if-eqz p2, :cond_1

    :cond_0
    move v0, v1

    .line 2869
    :cond_1
    :goto_0
    return v0

    :cond_2
    move v2, v0

    .line 2859
    :goto_1
    if-ge v2, v3, :cond_1

    .line 2860
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v4, v2}, Lxb;->b(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v4

    .line 2861
    invoke-virtual {v4}, Lzr;->b()Z

    move-result v5

    if-nez v5, :cond_4

    .line 2864
    invoke-virtual {v4}, Lzr;->d()I

    move-result v4

    .line 2865
    if-lt v4, p1, :cond_3

    if-le v4, p2, :cond_4

    :cond_3
    move v0, v1

    .line 2866
    goto :goto_0

    .line 2859
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public static synthetic g(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->q()V

    return-void
.end method

.method public static synthetic h(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->g()Z

    move-result v0

    return v0
.end method

.method public static synthetic i()Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 139
    sget-object v0, Landroid/support/v7/widget/RecyclerView;->ai:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method public static synthetic i(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->r()V

    return-void
.end method

.method public static synthetic j(Landroid/support/v7/widget/RecyclerView;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static synthetic j()Z
    .locals 1

    .prologue
    .line 139
    sget-boolean v0, Landroid/support/v7/widget/RecyclerView;->s:Z

    return v0
.end method

.method private k()V
    .locals 1

    .prologue
    .line 1335
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1336
    return-void
.end method

.method public static synthetic k(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->awakenScrollBars()Z

    move-result v0

    return v0
.end method

.method private l()V
    .locals 1

    .prologue
    .line 1643
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 1644
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->m()V

    .line 1645
    return-void
.end method

.method public static synthetic l(Landroid/support/v7/widget/RecyclerView;)V
    .locals 6

    .prologue
    const/16 v5, 0x200

    const/4 v0, 0x0

    .line 139
    .line 50330
    iget-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->h:Z

    if-nez v1, :cond_3

    .line 50333
    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->h:Z

    .line 50334
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v1}, Lxb;->b()I

    move-result v2

    move v1, v0

    .line 50335
    :goto_0
    if-ge v1, v2, :cond_1

    .line 50336
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v3, v1}, Lxb;->c(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v3

    .line 50337
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lzr;->b()Z

    move-result v4

    if-nez v4, :cond_0

    .line 50338
    invoke-virtual {v3, v5}, Lzr;->a(I)V

    .line 50335
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 50341
    :cond_1
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 50343
    iget-object v1, v2, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v0

    .line 50344
    :goto_1
    if-ge v1, v3, :cond_3

    .line 50345
    iget-object v0, v2, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 50346
    if-eqz v0, :cond_2

    .line 50347
    invoke-virtual {v0, v5}, Lzr;->a(I)V

    .line 50344
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 139
    :cond_3
    return-void
.end method

.method private m()V
    .locals 2

    .prologue
    .line 1651
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->V:Lzq;

    .line 24959
    iget-object v1, v0, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 24960
    iget-object v0, v0, Lzq;->c:Llr;

    invoke-virtual {v0}, Llr;->f()V

    .line 1652
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v0, :cond_0

    .line 1653
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 1655
    :cond_0
    return-void
.end method

.method public static synthetic m(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Z

    return v0
.end method

.method private n()V
    .locals 2

    .prologue
    .line 1711
    const/4 v0, 0x0

    .line 1712
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    if-eqz v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    invoke-virtual {v0}, Llc;->c()Z

    move-result v0

    .line 1713
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    invoke-virtual {v1}, Llc;->c()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1714
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    invoke-virtual {v1}, Llc;->c()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1715
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    invoke-virtual {v1}, Llc;->c()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1716
    :cond_3
    if-eqz v0, :cond_4

    .line 1717
    invoke-static {p0}, Lgt;->d(Landroid/view/View;)V

    .line 1719
    :cond_4
    return-void
.end method

.method public static synthetic n(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->f:Z

    return v0
.end method

.method private o()V
    .locals 1

    .prologue
    .line 1816
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    .line 1817
    return-void
.end method

.method public static synthetic o(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Z

    return v0
.end method

.method public static synthetic p(Landroid/support/v7/widget/RecyclerView;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Ljava/lang/Runnable;

    return-object v0
.end method

.method private p()V
    .locals 1

    .prologue
    .line 2265
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2266
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2268
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->stopNestedScroll()V

    .line 2269
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->n()V

    .line 2270
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 2271
    return-void
.end method

.method public static synthetic q(Landroid/support/v7/widget/RecyclerView;)Landroid/view/accessibility/AccessibilityManager;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/view/accessibility/AccessibilityManager;

    return-object v0
.end method

.method private q()V
    .locals 1

    .prologue
    .line 2438
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    .line 2439
    return-void
.end method

.method public static synthetic r(Landroid/support/v7/widget/RecyclerView;)Lzs;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ab:Lzs;

    return-object v0
.end method

.method private r()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 2442
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    .line 2443
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    if-gtz v0, :cond_0

    .line 2448
    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    .line 37454
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    .line 37455
    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    .line 37456
    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 37457
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    .line 37458
    const/16 v2, 0x800

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 37459
    invoke-static {v1, v0}, Liz;->a(Landroid/view/accessibility/AccessibilityEvent;I)V

    .line 37460
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2451
    :cond_0
    return-void
.end method

.method public static synthetic s(Landroid/support/v7/widget/RecyclerView;)Ls;
    .locals 1

    .prologue
    .line 139
    const/4 v0, 0x0

    return-object v0
.end method

.method private s()V
    .locals 1

    .prologue
    .line 2540
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Z

    if-eqz v0, :cond_0

    .line 2541
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ah:Ljava/lang/Runnable;

    invoke-static {p0, v0}, Lgt;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 2542
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Z

    .line 2544
    :cond_0
    return-void
.end method

.method private t()V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 2557
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->h:Z

    if-eqz v0, :cond_0

    .line 2560
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->a()V

    .line 2561
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->w()V

    .line 2562
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->b()V

    .line 2567
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2568
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->b()V

    .line 2572
    :goto_0
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->q:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Z

    if-eqz v0, :cond_2

    :cond_1
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->q:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_2
    move v0, v2

    .line 2574
    :goto_1
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v3, :cond_4

    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->h:Z

    if-nez v3, :cond_3

    if-nez v0, :cond_3

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-static {v3}, Lzh;->a(Lzh;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->h:Z

    if-eqz v3, :cond_7

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    :cond_4
    move v3, v1

    .line 40040
    :goto_2
    iput-boolean v3, v4, Lzp;->k:Z

    .line 2578
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 41040
    iget-boolean v4, v4, Lzp;->k:Z

    .line 2578
    if-eqz v4, :cond_9

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->h:Z

    if-nez v0, :cond_9

    .line 41547
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->g()Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v2

    .line 2578
    :goto_3
    if-eqz v0, :cond_9

    .line 42040
    :goto_4
    iput-boolean v2, v3, Lzp;->l:Z

    .line 2581
    return-void

    .line 2570
    :cond_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->e()V

    goto :goto_0

    :cond_6
    move v0, v1

    .line 2572
    goto :goto_1

    :cond_7
    move v3, v2

    .line 2574
    goto :goto_2

    :cond_8
    move v0, v1

    .line 41547
    goto :goto_3

    :cond_9
    move v2, v1

    .line 2578
    goto :goto_4
.end method

.method private u()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 3027
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->b()I

    move-result v3

    move v2, v1

    .line 3028
    :goto_0
    if-ge v2, v3, :cond_0

    .line 3029
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0, v2}, Lxb;->c(I)Landroid/view/View;

    move-result-object v0

    .line 3030
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    iput-boolean v4, v0, Lzi;->e:Z

    .line 3028
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 3032
    :cond_0
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 50134
    iget-object v0, v2, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 50135
    :goto_1
    if-ge v1, v3, :cond_2

    .line 50136
    iget-object v0, v2, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 50137
    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 50138
    if-eqz v0, :cond_1

    .line 50139
    iput-boolean v4, v0, Lzi;->e:Z

    .line 50135
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 3033
    :cond_2
    return-void
.end method

.method private v()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 3162
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->b()I

    move-result v2

    move v0, v1

    .line 3163
    :goto_0
    if-ge v0, v2, :cond_1

    .line 3164
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v3, v0}, Lxb;->c(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v3

    .line 3165
    invoke-virtual {v3}, Lzr;->b()Z

    move-result v4

    if-nez v4, :cond_0

    .line 3166
    invoke-virtual {v3}, Lzr;->a()V

    .line 3163
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3169
    :cond_1
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 50143
    iget-object v0, v3, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v2, v1

    .line 50144
    :goto_1
    if-ge v2, v4, :cond_2

    .line 50145
    iget-object v0, v3, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 50146
    invoke-virtual {v0}, Lzr;->a()V

    .line 50144
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 50148
    :cond_2
    iget-object v0, v3, Lzl;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v2, v1

    .line 50149
    :goto_2
    if-ge v2, v4, :cond_3

    .line 50150
    iget-object v0, v3, Lzl;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    invoke-virtual {v0}, Lzr;->a()V

    .line 50149
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 50152
    :cond_3
    iget-object v0, v3, Lzl;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 50153
    iget-object v0, v3, Lzl;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 50154
    :goto_3
    if-ge v1, v2, :cond_4

    .line 50155
    iget-object v0, v3, Lzl;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    invoke-virtual {v0}, Lzr;->a()V

    .line 50154
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 3170
    :cond_4
    return-void
.end method

.method private w()V
    .locals 4

    .prologue
    .line 3335
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->b()I

    move-result v1

    .line 3336
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 3337
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v2, v0}, Lxb;->c(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v2

    .line 3338
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lzr;->b()Z

    move-result v3

    if-nez v3, :cond_0

    .line 3339
    const/4 v3, 0x6

    invoke-virtual {v2, v3}, Lzr;->a(I)V

    .line 3336
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3342
    :cond_1
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()V

    .line 3343
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 50185
    iget-object v1, v0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    .line 50198
    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    .line 50185
    if-eqz v1, :cond_2

    iget-object v1, v0, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    .line 50199
    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    .line 50195
    :cond_2
    invoke-virtual {v0}, Lzl;->b()V

    .line 3344
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Lzr;
    .locals 3

    .prologue
    .line 3369
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 3370
    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    .line 3371
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not a direct child of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3374
    :cond_0
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 1550
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    if-nez v0, :cond_0

    .line 1551
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    .line 1552
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    .line 1554
    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 1264
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->l()V

    .line 1265
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v0, :cond_0

    .line 1266
    const-string v0, "RecyclerView"

    const-string v1, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1272
    :goto_0
    return-void

    .line 1270
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0, p1}, Lzh;->c(I)V

    .line 1271
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->awakenScrollBars()Z

    goto :goto_0
.end method

.method public final a(II)V
    .locals 13

    .prologue
    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 1574
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v0, :cond_1

    .line 1575
    const-string v0, "RecyclerView"

    const-string v1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1588
    :cond_0
    :goto_0
    return-void

    .line 1579
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->i()Z

    move-result v0

    if-nez v0, :cond_9

    move v3, v1

    .line 1582
    :goto_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->j()Z

    move-result v0

    if-nez v0, :cond_8

    move v4, v1

    .line 1585
    :goto_2
    if-nez v3, :cond_2

    if-eqz v4, :cond_0

    .line 1586
    :cond_2
    iget-object v7, p0, Landroid/support/v7/widget/RecyclerView;->V:Lzq;

    .line 21922
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v5

    .line 21923
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v6

    .line 21924
    if-le v5, v6, :cond_4

    const/4 v0, 0x1

    .line 21925
    :goto_3
    int-to-double v8, v1

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-int v8, v8

    .line 21926
    mul-int v2, v3, v3

    mul-int v9, v4, v4

    add-int/2addr v2, v9

    int-to-double v10, v2

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    double-to-int v9, v10

    .line 21927
    if-eqz v0, :cond_5

    iget-object v2, v7, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v2

    .line 21928
    :goto_4
    div-int/lit8 v10, v2, 0x2

    .line 21929
    int-to-float v9, v9

    mul-float/2addr v9, v12

    int-to-float v11, v2

    div-float/2addr v9, v11

    invoke-static {v12, v9}, Ljava/lang/Math;->min(FF)F

    move-result v9

    .line 21930
    int-to-float v11, v10

    int-to-float v10, v10

    invoke-static {v9}, Lzq;->a(F)F

    move-result v9

    mul-float/2addr v9, v10

    add-float/2addr v9, v11

    .line 21934
    if-lez v8, :cond_6

    .line 21935
    const/high16 v0, 0x447a0000    # 1000.0f

    int-to-float v2, v8

    div-float v2, v9, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    .line 21940
    :goto_5
    const/16 v2, 0x7d0

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 22139
    sget-object v0, Landroid/support/v7/widget/RecyclerView;->ai:Landroid/view/animation/Interpolator;

    .line 22948
    iget-object v2, v7, Lzq;->d:Landroid/view/animation/Interpolator;

    if-eq v2, v0, :cond_3

    .line 22949
    iput-object v0, v7, Lzq;->d:Landroid/view/animation/Interpolator;

    .line 22950
    iget-object v2, v7, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Llr;->a(Landroid/content/Context;Landroid/view/animation/Interpolator;)Llr;

    move-result-object v0

    iput-object v0, v7, Lzq;->c:Llr;

    .line 22952
    :cond_3
    iget-object v0, v7, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x2

    .line 23139
    invoke-direct {v0, v2}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 22953
    iput v1, v7, Lzq;->b:I

    iput v1, v7, Lzq;->a:I

    .line 22954
    iget-object v0, v7, Lzq;->c:Llr;

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Llr;->a(IIIII)V

    .line 22955
    invoke-virtual {v7}, Lzq;->a()V

    goto/16 :goto_0

    :cond_4
    move v0, v1

    .line 21924
    goto :goto_3

    .line 21927
    :cond_5
    iget-object v2, v7, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v2

    goto :goto_4

    .line 21937
    :cond_6
    if-eqz v0, :cond_7

    move v0, v5

    :goto_6
    int-to-float v0, v0

    .line 21938
    int-to-float v2, v2

    div-float/2addr v0, v2

    add-float/2addr v0, v12

    const/high16 v2, 0x43960000    # 300.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    goto :goto_5

    :cond_7
    move v0, v6

    .line 21937
    goto :goto_6

    :cond_8
    move v4, p2

    goto/16 :goto_2

    :cond_9
    move v3, p1

    goto/16 :goto_1
.end method

.method public final a(IIZ)V
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v6, 0x1

    .line 3225
    add-int v1, p1, p2

    .line 3226
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->b()I

    move-result v2

    .line 3227
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_2

    .line 3228
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v3, v0}, Lxb;->c(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v3

    .line 3229
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lzr;->b()Z

    move-result v4

    if-nez v4, :cond_0

    .line 3230
    iget v4, v3, Lzr;->b:I

    if-lt v4, v1, :cond_1

    .line 3236
    neg-int v4, p2

    invoke-virtual {v3, v4, p3}, Lzr;->a(IZ)V

    .line 3237
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50159
    iput-boolean v6, v3, Lzp;->i:Z

    .line 3227
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3238
    :cond_1
    iget v4, v3, Lzr;->b:I

    if-lt v4, p1, :cond_0

    .line 3243
    add-int/lit8 v4, p1, -0x1

    neg-int v5, p2

    .line 50160
    invoke-virtual {v3, v7}, Lzr;->a(I)V

    .line 50161
    invoke-virtual {v3, v5, p3}, Lzr;->a(IZ)V

    .line 50162
    iput v4, v3, Lzr;->b:I

    .line 3245
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50164
    iput-boolean v6, v3, Lzp;->i:Z

    goto :goto_1

    .line 3249
    :cond_2
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 50165
    add-int v3, p1, p2

    .line 50166
    iget-object v0, v2, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 50167
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_5

    .line 50168
    iget-object v0, v2, Lzl;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 50169
    if-eqz v0, :cond_3

    .line 50170
    invoke-virtual {v0}, Lzr;->d()I

    move-result v4

    if-lt v4, v3, :cond_4

    .line 50176
    neg-int v4, p2

    invoke-virtual {v0, v4, p3}, Lzr;->a(IZ)V

    .line 50167
    :cond_3
    :goto_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 50177
    :cond_4
    invoke-virtual {v0}, Lzr;->d()I

    move-result v4

    if-lt v4, p1, :cond_3

    .line 50179
    invoke-virtual {v0, v7}, Lzr;->a(I)V

    .line 50180
    invoke-virtual {v2, v1}, Lzl;->b(I)V

    goto :goto_3

    .line 3250
    :cond_5
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 3251
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1939
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1940
    if-nez p1, :cond_0

    .line 1941
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot call this method while RecyclerView is computing a layout or scrolling"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1944
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1946
    :cond_1
    return-void
.end method

.method public final a(Lyz;)V
    .locals 4

    .prologue
    .line 779
    .line 12794
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    if-eqz v0, :cond_0

    .line 12795
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->u:Lzm;

    .line 13327
    iget-object v0, v0, Lyz;->a:Lza;

    invoke-virtual {v0, v1}, Lza;->unregisterObserver(Ljava/lang/Object;)V

    .line 12800
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v0, :cond_1

    .line 12801
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    invoke-virtual {v0}, Lzc;->d()V

    .line 12807
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v0, :cond_4

    .line 12808
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 13358
    invoke-virtual {v1}, Lzh;->n()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    .line 13359
    invoke-virtual {v1, v0}, Lzh;->f(I)Landroid/view/View;

    move-result-object v3

    .line 13360
    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v3

    invoke-virtual {v3}, Lzr;->b()Z

    move-result v3

    if-nez v3, :cond_2

    .line 13361
    invoke-virtual {v1, v0, v2}, Lzh;->a(ILzl;)V

    .line 13358
    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 12809
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    invoke-virtual {v0, v1}, Lzh;->a(Lzl;)V

    .line 12812
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    invoke-virtual {v0}, Lzl;->a()V

    .line 12814
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->a()V

    .line 12815
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    .line 12816
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    .line 12817
    if-eqz p1, :cond_5

    .line 12818
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->u:Lzm;

    .line 14313
    iget-object v2, p1, Lyz;->a:Lza;

    invoke-virtual {v2, v1}, Lza;->registerObserver(Ljava/lang/Object;)V

    .line 12824
    :cond_5
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    .line 14852
    invoke-virtual {v1}, Lzl;->a()V

    .line 14853
    invoke-virtual {v1}, Lzl;->c()Lzk;

    move-result-object v1

    .line 15114
    if-eqz v0, :cond_6

    .line 16097
    iget v0, v1, Lzk;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v1, Lzk;->c:I

    .line 15117
    :cond_6
    iget v0, v1, Lzk;->c:I

    if-nez v0, :cond_7

    .line 17044
    iget-object v0, v1, Lzk;->a:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 15120
    :cond_7
    if-eqz v2, :cond_8

    .line 17093
    iget v0, v1, Lzk;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v1, Lzk;->c:I

    .line 12825
    :cond_8
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    const/4 v1, 0x1

    .line 18040
    iput-boolean v1, v0, Lzp;->i:Z

    .line 12826
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->w()V

    .line 780
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 781
    return-void
.end method

.method public final a(Lzc;)V
    .locals 2

    .prologue
    .line 2427
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v0, :cond_0

    .line 2428
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    invoke-virtual {v0}, Lzc;->d()V

    .line 2429
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    const/4 v1, 0x0

    .line 35485
    iput-object v1, v0, Lzc;->h:Lzd;

    .line 2431
    :cond_0
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    .line 2432
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v0, :cond_1

    .line 2433
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->W:Lzd;

    .line 36485
    iput-object v1, v0, Lzc;->h:Lzd;

    .line 2435
    :cond_1
    return-void
.end method

.method public final a(Lzf;)V
    .locals 2

    .prologue
    .line 1161
    .line 21132
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v0, :cond_0

    .line 21133
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    const-string v1, "Cannot add item decoration during a scroll  or layout"

    invoke-virtual {v0, v1}, Lzh;->a(Ljava/lang/String;)V

    .line 21136
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 21137
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->setWillNotDraw(Z)V

    .line 21140
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21144
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()V

    .line 21145
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 1162
    return-void
.end method

.method public final a(Lzh;)V
    .locals 3

    .prologue
    .line 923
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-ne p1, v0, :cond_0

    .line 948
    :goto_0
    return-void

    .line 928
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v0, :cond_2

    .line 929
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Z

    if-eqz v0, :cond_1

    .line 930
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 18634
    invoke-virtual {v0, p0, v1}, Lzh;->a(Landroid/support/v7/widget/RecyclerView;Lzl;)V

    .line 932
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lzh;->a(Landroid/support/v7/widget/RecyclerView;)V

    .line 934
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    invoke-virtual {v0}, Lzl;->a()V

    .line 935
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    .line 19164
    iget-object v1, v0, Lxb;->b:Lxc;

    invoke-virtual {v1}, Lxc;->a()V

    .line 19165
    iget-object v1, v0, Lxb;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 19166
    iget-object v0, v0, Lxb;->a:Lxd;

    invoke-interface {v0}, Lxd;->b()V

    .line 936
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 937
    if-eqz p1, :cond_4

    .line 938
    iget-object v0, p1, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_3

    .line 939
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "LayoutManager "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is already attached to a RecyclerView: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p1, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 942
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0, p0}, Lzh;->a(Landroid/support/v7/widget/RecyclerView;)V

    .line 947
    :cond_4
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1557
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    if-eqz v0, :cond_1

    .line 1558
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    if-eqz v0, :cond_0

    .line 1560
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->h()V

    .line 1562
    :cond_0
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    .line 1563
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    .line 1565
    :cond_1
    return-void
.end method

.method public addFocusables(Ljava/util/ArrayList;II)V
    .locals 0

    .prologue
    .line 1873
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 1875
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 1763
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    if-eqz v0, :cond_0

    .line 1773
    :goto_0
    return-void

    .line 1766
    :cond_0
    new-instance v0, Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Llc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    .line 1767
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v0, :cond_1

    .line 1768
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Llc;->a(II)V

    goto :goto_0

    .line 1771
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Llc;->a(II)V

    goto :goto_0
.end method

.method public b(II)Z
    .locals 11

    .prologue
    const v6, 0x7fffffff

    const/4 v9, 0x1

    const/high16 v5, -0x80000000

    const/4 v1, 0x0

    .line 1604
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v0, :cond_1

    .line 1605
    const-string v0, "RecyclerView"

    const-string v2, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1635
    :cond_0
    :goto_0
    return v1

    .line 1610
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->i()Z

    move-result v0

    .line 1611
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v2}, Lzh;->j()Z

    move-result v2

    .line 1613
    if-eqz v0, :cond_2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    if-ge v3, v4, :cond_3

    :cond_2
    move p1, v1

    .line 1616
    :cond_3
    if-eqz v2, :cond_4

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    if-ge v3, v4, :cond_5

    :cond_4
    move p2, v1

    .line 1619
    :cond_5
    if-nez p1, :cond_6

    if-eqz p2, :cond_0

    .line 1624
    :cond_6
    int-to-float v3, p1

    int-to-float v4, p2

    invoke-virtual {p0, v3, v4}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedPreFling(FF)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1625
    if-nez v0, :cond_7

    if-eqz v2, :cond_8

    :cond_7
    move v0, v9

    .line 1626
    :goto_1
    int-to-float v2, p1

    int-to-float v3, p2

    invoke-virtual {p0, v2, v3, v0}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedFling(FFZ)Z

    .line 1628
    if-eqz v0, :cond_0

    .line 1629
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    neg-int v0, v0

    iget v2, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 1630
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    neg-int v0, v0

    iget v2, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1631
    iget-object v10, p0, Landroid/support/v7/widget/RecyclerView;->V:Lzq;

    .line 23900
    iget-object v0, v10, Lzq;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x2

    .line 24139
    invoke-direct {v0, v2}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 23901
    iput v1, v10, Lzq;->b:I

    iput v1, v10, Lzq;->a:I

    .line 23902
    iget-object v0, v10, Lzq;->c:Llr;

    move v2, v1

    move v7, v5

    move v8, v6

    invoke-virtual/range {v0 .. v8}, Llr;->a(IIIIIIII)V

    .line 23904
    invoke-virtual {v10}, Lzq;->a()V

    move v1, v9

    .line 1632
    goto :goto_0

    :cond_8
    move v0, v1

    .line 1625
    goto :goto_1
.end method

.method public final c(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 3613
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 3614
    iget-boolean v1, v0, Lzi;->e:Z

    if-nez v1, :cond_0

    .line 3615
    iget-object v0, v0, Lzi;->d:Landroid/graphics/Rect;

    .line 3630
    :goto_0
    return-object v0

    .line 3618
    :cond_0
    iget-object v2, v0, Lzi;->d:Landroid/graphics/Rect;

    .line 3619
    invoke-virtual {v2, v4, v4, v4, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 3620
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v3, v4

    .line 3621
    :goto_1
    if-ge v3, v5, :cond_1

    .line 3622
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    invoke-virtual {v1, v4, v4, v4, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 3623
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzf;

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    invoke-virtual {v1, v6, p1, p0}, Lzf;->a(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;)V

    .line 3624
    iget v1, v2, Landroid/graphics/Rect;->left:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->left:I

    .line 3625
    iget v1, v2, Landroid/graphics/Rect;->top:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->top:I

    .line 3626
    iget v1, v2, Landroid/graphics/Rect;->right:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->right:I

    .line 3627
    iget v1, v2, Landroid/graphics/Rect;->bottom:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->bottom:I

    .line 3621
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_1

    .line 3629
    :cond_1
    iput-boolean v4, v0, Lzi;->e:Z

    move-object v0, v2

    .line 3630
    goto :goto_0
.end method

.method public final c()V
    .locals 4

    .prologue
    .line 1776
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    if-eqz v0, :cond_0

    .line 1786
    :goto_0
    return-void

    .line 1779
    :cond_0
    new-instance v0, Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Llc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    .line 1780
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v0, :cond_1

    .line 1781
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Llc;->a(II)V

    goto :goto_0

    .line 1784
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Llc;->a(II)V

    goto :goto_0
.end method

.method public final c(II)V
    .locals 2

    .prologue
    .line 3660
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getScrollX()I

    move-result v0

    .line 3661
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getScrollY()I

    move-result v1

    .line 3662
    invoke-virtual {p0, v0, v1, v0, v1}, Landroid/support/v7/widget/RecyclerView;->onScrollChanged(IIII)V

    .line 3669
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Lzj;

    if-eqz v0, :cond_0

    .line 3670
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Lzj;

    invoke-virtual {v0, p0, p1, p2}, Lzj;->a(Landroid/support/v7/widget/RecyclerView;II)V

    .line 3672
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 3673
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 3674
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzj;

    invoke-virtual {v0, p0, p1, p2}, Lzj;->a(Landroid/support/v7/widget/RecyclerView;II)V

    .line 3673
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 3677
    :cond_1
    return-void
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 3108
    instance-of v0, p1, Lzi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    check-cast p1, Lzi;

    invoke-virtual {v0, p1}, Lzh;->a(Lzi;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeHorizontalScrollExtent()I
    .locals 2

    .prologue
    .line 1462
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, v1}, Lzh;->c(Lzp;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeHorizontalScrollOffset()I
    .locals 2

    .prologue
    .line 1439
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, v1}, Lzh;->a(Lzp;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeHorizontalScrollRange()I
    .locals 2

    .prologue
    .line 1482
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, v1}, Lzh;->e(Lzp;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeVerticalScrollExtent()I
    .locals 2

    .prologue
    .line 1525
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, v1}, Lzh;->d(Lzp;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeVerticalScrollOffset()I
    .locals 2

    .prologue
    .line 1504
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, v1}, Lzh;->b(Lzp;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeVerticalScrollRange()I
    .locals 2

    .prologue
    .line 1545
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, v1}, Lzh;->f(Lzp;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()V
    .locals 4

    .prologue
    .line 1789
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    if-eqz v0, :cond_0

    .line 1800
    :goto_0
    return-void

    .line 1792
    :cond_0
    new-instance v0, Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Llc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    .line 1793
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v0, :cond_1

    .line 1794
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Llc;->a(II)V

    goto :goto_0

    .line 1797
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Llc;->a(II)V

    goto :goto_0
.end method

.method public dispatchNestedFling(FFZ)Z
    .locals 2

    .prologue
    .line 8381
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Lgj;

    .line 50298
    iget-boolean v1, v0, Lgj;->c:Z

    .line 50293
    if-eqz v1, :cond_0

    iget-object v1, v0, Lgj;->b:Landroid/view/ViewParent;

    if-eqz v1, :cond_0

    .line 50294
    iget-object v1, v0, Lgj;->b:Landroid/view/ViewParent;

    iget-object v0, v0, Lgj;->a:Landroid/view/View;

    invoke-static {v1, v0, p1, p2, p3}, Lic;->a(Landroid/view/ViewParent;Landroid/view/View;FFZ)Z

    move-result v0

    :goto_0
    return v0

    .line 50297
    :cond_0
    const/4 v0, 0x0

    .line 8381
    goto :goto_0
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 2

    .prologue
    .line 8386
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Lgj;

    .line 50304
    iget-boolean v1, v0, Lgj;->c:Z

    .line 50299
    if-eqz v1, :cond_0

    iget-object v1, v0, Lgj;->b:Landroid/view/ViewParent;

    if-eqz v1, :cond_0

    .line 50300
    iget-object v1, v0, Lgj;->b:Landroid/view/ViewParent;

    iget-object v0, v0, Lgj;->a:Landroid/view/View;

    invoke-static {v1, v0, p1, p2}, Lic;->a(Landroid/view/ViewParent;Landroid/view/View;FF)Z

    move-result v0

    :goto_0
    return v0

    .line 50303
    :cond_0
    const/4 v0, 0x0

    .line 8386
    goto :goto_0
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 8376
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ad:Lgj;

    .line 50292
    iget-boolean v2, v4, Lgj;->c:Z

    .line 50260
    if-eqz v2, :cond_7

    iget-object v2, v4, Lgj;->b:Landroid/view/ViewParent;

    if-eqz v2, :cond_7

    .line 50261
    if-nez p1, :cond_0

    if-eqz p2, :cond_6

    .line 50264
    :cond_0
    if-eqz p4, :cond_8

    .line 50265
    iget-object v2, v4, Lgj;->a:Landroid/view/View;

    invoke-virtual {v2, p4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 50266
    aget v3, p4, v1

    .line 50267
    aget v2, p4, v0

    .line 50270
    :goto_0
    if-nez p3, :cond_2

    .line 50271
    iget-object v5, v4, Lgj;->d:[I

    if-nez v5, :cond_1

    .line 50272
    const/4 v5, 0x2

    new-array v5, v5, [I

    iput-object v5, v4, Lgj;->d:[I

    .line 50274
    :cond_1
    iget-object p3, v4, Lgj;->d:[I

    .line 50276
    :cond_2
    aput v1, p3, v1

    .line 50277
    aput v1, p3, v0

    .line 50278
    iget-object v5, v4, Lgj;->b:Landroid/view/ViewParent;

    iget-object v6, v4, Lgj;->a:Landroid/view/View;

    invoke-static {v5, v6, p1, p2, p3}, Lic;->a(Landroid/view/ViewParent;Landroid/view/View;II[I)V

    .line 50280
    if-eqz p4, :cond_3

    .line 50281
    iget-object v4, v4, Lgj;->a:Landroid/view/View;

    invoke-virtual {v4, p4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 50282
    aget v4, p4, v1

    sub-int v3, v4, v3

    aput v3, p4, v1

    .line 50283
    aget v3, p4, v0

    sub-int v2, v3, v2

    aput v2, p4, v0

    .line 50285
    :cond_3
    aget v2, p3, v1

    if-nez v2, :cond_4

    aget v2, p3, v0

    if-eqz v2, :cond_5

    :cond_4
    :goto_1
    move v1, v0

    :cond_5
    return v1

    .line 50286
    :cond_6
    if-eqz p4, :cond_7

    .line 50287
    aput v1, p4, v1

    .line 50288
    aput v1, p4, v0

    :cond_7
    move v0, v1

    .line 50291
    goto :goto_1

    :cond_8
    move v2, v1

    move v3, v1

    goto :goto_0
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 9

    .prologue
    .line 8370
    iget-object v8, p0, Landroid/support/v7/widget/RecyclerView;->ad:Lgj;

    .line 50259
    iget-boolean v0, v8, Lgj;->c:Z

    .line 50233
    if-eqz v0, :cond_3

    iget-object v0, v8, Lgj;->b:Landroid/view/ViewParent;

    if-eqz v0, :cond_3

    .line 50234
    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-eqz p4, :cond_2

    .line 50235
    :cond_0
    const/4 v1, 0x0

    .line 50236
    const/4 v0, 0x0

    .line 50237
    if-eqz p5, :cond_4

    .line 50238
    iget-object v0, v8, Lgj;->a:Landroid/view/View;

    invoke-virtual {v0, p5}, Landroid/view/View;->getLocationInWindow([I)V

    .line 50239
    const/4 v0, 0x0

    aget v1, p5, v0

    .line 50240
    const/4 v0, 0x1

    aget v0, p5, v0

    move v6, v0

    move v7, v1

    .line 50243
    :goto_0
    iget-object v0, v8, Lgj;->b:Landroid/view/ViewParent;

    iget-object v1, v8, Lgj;->a:Landroid/view/View;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lic;->a(Landroid/view/ViewParent;Landroid/view/View;IIII)V

    .line 50246
    if-eqz p5, :cond_1

    .line 50247
    iget-object v0, v8, Lgj;->a:Landroid/view/View;

    invoke-virtual {v0, p5}, Landroid/view/View;->getLocationInWindow([I)V

    .line 50248
    const/4 v0, 0x0

    aget v1, p5, v0

    sub-int/2addr v1, v7

    aput v1, p5, v0

    .line 50249
    const/4 v0, 0x1

    aget v1, p5, v0

    sub-int/2addr v1, v6

    aput v1, p5, v0

    .line 50251
    :cond_1
    const/4 v0, 0x1

    :goto_1
    return v0

    .line 50252
    :cond_2
    if-eqz p5, :cond_3

    .line 50254
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v1, p5, v0

    .line 50255
    const/4 v0, 0x1

    const/4 v1, 0x0

    aput v1, p5, v0

    .line 50258
    :cond_3
    const/4 v0, 0x0

    .line 8370
    goto :goto_1

    :cond_4
    move v6, v0

    move v7, v1

    goto :goto_0
.end method

.method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .prologue
    .line 986
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 987
    return-void
.end method

.method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .prologue
    .line 978
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 979
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 3037
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 3039
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v0, v1

    .line 3040
    :goto_0
    if-ge v0, v3, :cond_0

    .line 3041
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3040
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3046
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    if-eqz v0, :cond_e

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    invoke-virtual {v0}, Llc;->a()Z

    move-result v0

    if-nez v0, :cond_e

    .line 3047
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 3048
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v0

    .line 3049
    :goto_1
    const/high16 v4, 0x43870000    # 270.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3050
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v4

    neg-int v4, v4

    add-int/2addr v0, v4

    int-to-float v0, v0

    const/4 v4, 0x0

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3051
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->i:Llc;

    invoke-virtual {v0, p1}, Llc;->a(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v2

    .line 3052
    :goto_2
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3054
    :goto_3
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    invoke-virtual {v3}, Llc;->a()Z

    move-result v3

    if-nez v3, :cond_2

    .line 3055
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 3056
    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v3, :cond_1

    .line 3057
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3059
    :cond_1
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    if-eqz v3, :cond_9

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->j:Llc;

    invoke-virtual {v3, p1}, Llc;->a(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_9

    move v3, v2

    :goto_4
    or-int/2addr v0, v3

    .line 3060
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3062
    :cond_2
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    invoke-virtual {v3}, Llc;->a()Z

    move-result v3

    if-nez v3, :cond_3

    .line 3063
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 3064
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v5

    .line 3065
    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v3, :cond_a

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v3

    .line 3066
    :goto_5
    const/high16 v6, 0x42b40000    # 90.0f

    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3067
    neg-int v3, v3

    int-to-float v3, v3

    neg-int v5, v5

    int-to-float v5, v5

    invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3068
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    if-eqz v3, :cond_b

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->k:Llc;

    invoke-virtual {v3, p1}, Llc;->a(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_b

    move v3, v2

    :goto_6
    or-int/2addr v0, v3

    .line 3069
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3071
    :cond_3
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    if-eqz v3, :cond_5

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    invoke-virtual {v3}, Llc;->a()Z

    move-result v3

    if-nez v3, :cond_5

    .line 3072
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 3073
    const/high16 v4, 0x43340000    # 180.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3074
    iget-boolean v4, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v4, :cond_c

    .line 3075
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v4

    neg-int v4, v4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v5

    add-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v5

    neg-int v5, v5

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v6

    add-int/2addr v5, v6

    int-to-float v5, v5

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3079
    :goto_7
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    if-eqz v4, :cond_4

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    invoke-virtual {v4, p1}, Llc;->a(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v1, v2

    :cond_4
    or-int/2addr v0, v1

    .line 3080
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3086
    :cond_5
    if-nez v0, :cond_d

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v1, :cond_d

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_d

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    invoke-virtual {v1}, Lzc;->b()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 3091
    :goto_8
    if-eqz v2, :cond_6

    .line 3092
    invoke-static {p0}, Lgt;->d(Landroid/view/View;)V

    .line 3094
    :cond_6
    return-void

    :cond_7
    move v0, v1

    .line 3048
    goto/16 :goto_1

    :cond_8
    move v0, v1

    .line 3051
    goto/16 :goto_2

    :cond_9
    move v3, v1

    .line 3059
    goto/16 :goto_4

    :cond_a
    move v3, v1

    .line 3065
    goto/16 :goto_5

    :cond_b
    move v3, v1

    .line 3068
    goto :goto_6

    .line 3077
    :cond_c
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_7

    :cond_d
    move v2, v0

    goto :goto_8

    :cond_e
    move v0, v1

    goto/16 :goto_3
.end method

.method public drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 1

    .prologue
    .line 3558
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v0

    return v0
.end method

.method public final e()V
    .locals 4

    .prologue
    .line 1803
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    if-eqz v0, :cond_0

    .line 1813
    :goto_0
    return-void

    .line 1806
    :cond_0
    new-instance v0, Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Llc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    .line 1807
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v0, :cond_1

    .line 1808
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Llc;->a(II)V

    goto :goto_0

    .line 1811
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Llc;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Llc;->a(II)V

    goto :goto_0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 2484
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 3

    .prologue
    .line 1827
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    .line 1828
    invoke-virtual {v0, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    .line 1829
    if-nez v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->f()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1830
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->a()V

    .line 1831
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, p2, v1, v2}, Lzh;->c(ILzl;Lzp;)Landroid/view/View;

    move-result-object v0

    .line 1832
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 1834
    :cond_0
    if-eqz v0, :cond_1

    :goto_0
    return-object v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 2532
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    .line 38453
    iget-boolean v0, v0, Lzc;->m:Z

    .line 2532
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 3113
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v0, :cond_0

    .line 3114
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3116
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->f()Lzi;

    move-result-object v0

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 3121
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v0, :cond_0

    .line 3122
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3124
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lzh;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Lzi;

    move-result-object v0

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 3129
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v0, :cond_0

    .line 3130
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3132
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0, p1}, Lzh;->a(Landroid/view/ViewGroup$LayoutParams;)Lzi;

    move-result-object v0

    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    .prologue
    .line 863
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v0, :cond_0

    .line 864
    const/4 v0, -0x1

    .line 866
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    move-result v0

    goto :goto_0
.end method

.method protected getChildDrawingOrder(II)I
    .locals 1

    .prologue
    .line 9897
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    move-result v0

    return v0
.end method

.method public final h()V
    .locals 14

    .prologue
    const/4 v9, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 2606
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    if-nez v0, :cond_1

    .line 2607
    const-string v0, "RecyclerView"

    const-string v1, "No adapter attached; skipping layout"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2826
    :cond_0
    :goto_0
    return-void

    .line 2610
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v0, :cond_2

    .line 2611
    const-string v0, "RecyclerView"

    const-string v1, "No layout manager attached; skipping layout"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 2614
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2615
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->a()V

    .line 2616
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->q()V

    .line 2618
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->t()V

    .line 2620
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 43040
    iget-boolean v0, v0, Lzp;->k:Z

    .line 2620
    if-eqz v0, :cond_4

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Led;

    invoke-direct {v0}, Led;-><init>()V

    :goto_1
    iput-object v0, v1, Lzp;->d:Led;

    .line 2622
    iput-boolean v8, p0, Landroid/support/v7/widget/RecyclerView;->r:Z

    iput-boolean v8, p0, Landroid/support/v7/widget/RecyclerView;->q:Z

    .line 2624
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 44040
    iget-boolean v1, v1, Lzp;->l:Z

    .line 45040
    iput-boolean v1, v0, Lzp;->j:Z

    .line 2625
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    invoke-virtual {v1}, Lyz;->a()I

    move-result v1

    iput v1, v0, Lzp;->f:I

    .line 2626
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ac:[I

    .line 45829
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->a()I

    move-result v5

    .line 45830
    if-nez v5, :cond_5

    .line 45831
    aput v8, v4, v8

    .line 45832
    aput v8, v4, v9

    .line 2628
    :goto_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 46040
    iget-boolean v0, v0, Lzp;->k:Z

    .line 2628
    if-eqz v0, :cond_9

    .line 2630
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->b:Led;

    invoke-virtual {v0}, Led;->clear()V

    .line 2631
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->c:Led;

    invoke-virtual {v0}, Led;->clear()V

    .line 2632
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->a()I

    move-result v10

    move v6, v8

    .line 2633
    :goto_3
    if-ge v6, v10, :cond_9

    .line 2634
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0, v6}, Lxb;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v1

    .line 2635
    invoke-virtual {v1}, Lzr;->b()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Lzr;->j()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    .line 2633
    :cond_3
    :goto_4
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_3

    :cond_4
    move-object v0, v7

    .line 2620
    goto :goto_1

    .line 45835
    :cond_5
    const v2, 0x7fffffff

    .line 45836
    const/high16 v1, -0x80000000

    move v3, v8

    .line 45837
    :goto_5
    if-ge v3, v5, :cond_7

    .line 45838
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0, v3}, Lxb;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v0

    .line 45839
    invoke-virtual {v0}, Lzr;->b()Z

    move-result v6

    if-nez v6, :cond_2b

    .line 45842
    invoke-virtual {v0}, Lzr;->d()I

    move-result v0

    .line 45843
    if-ge v0, v2, :cond_6

    move v2, v0

    .line 45846
    :cond_6
    if-le v0, v1, :cond_2b

    move v1, v2

    .line 45837
    :goto_6
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v1

    move v1, v0

    goto :goto_5

    .line 45850
    :cond_7
    aput v2, v4, v8

    .line 45851
    aput v1, v4, v9

    goto :goto_2

    .line 2638
    :cond_8
    iget-object v5, v1, Lzr;->a:Landroid/view/View;

    .line 2639
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v11, v0, Lzp;->b:Led;

    new-instance v0, Lzg;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lzg;-><init>(Lzr;IIII)V

    invoke-virtual {v11, v1, v0}, Led;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 2643
    :cond_9
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 47040
    iget-boolean v0, v0, Lzp;->l:Z

    .line 2643
    if-eqz v0, :cond_12

    .line 47148
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->b()I

    move-result v1

    move v0, v8

    .line 47149
    :goto_7
    if-ge v0, v1, :cond_b

    .line 47150
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v2, v0}, Lxb;->c(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v2

    .line 47155
    invoke-virtual {v2}, Lzr;->b()Z

    move-result v3

    if-nez v3, :cond_a

    .line 48064
    iget v3, v2, Lzr;->c:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_a

    .line 48065
    iget v3, v2, Lzr;->b:I

    iput v3, v2, Lzr;->c:I

    .line 47149
    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 2652
    :cond_b
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->d:Led;

    if-eqz v0, :cond_d

    .line 2653
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->a()I

    move-result v1

    move v0, v8

    .line 2654
    :goto_8
    if-ge v0, v1, :cond_d

    .line 2655
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v2, v0}, Lxb;->b(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v2

    .line 2656
    invoke-virtual {v2}, Lzr;->l()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v2}, Lzr;->n()Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v2}, Lzr;->b()Z

    move-result v3

    if-nez v3, :cond_c

    .line 2657
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Lzr;)J

    move-result-wide v4

    .line 2658
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v3, v3, Lzp;->d:Led;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Led;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2659
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v3, v3, Lzp;->b:Led;

    invoke-virtual {v3, v2}, Led;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2654
    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    .line 2664
    :cond_d
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 49040
    iget-boolean v0, v0, Lzp;->i:Z

    .line 2665
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50040
    iput-boolean v8, v1, Lzp;->i:Z

    .line 2667
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v1, v2, v3}, Lzh;->c(Lzl;Lzp;)V

    .line 2668
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50041
    iput-boolean v0, v1, Lzp;->i:Z

    .line 2670
    new-instance v3, Led;

    invoke-direct {v3}, Led;-><init>()V

    move v1, v8

    .line 2671
    :goto_9
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->a()I

    move-result v0

    if-ge v1, v0, :cond_10

    .line 2673
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0, v1}, Lxb;->b(I)Landroid/view/View;

    move-result-object v4

    .line 2674
    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v0

    invoke-virtual {v0}, Lzr;->b()Z

    move-result v0

    if-nez v0, :cond_e

    move v2, v8

    .line 2677
    :goto_a
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->b:Led;

    invoke-virtual {v0}, Led;->size()I

    move-result v0

    if-ge v2, v0, :cond_2a

    .line 2678
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->b:Led;

    invoke-virtual {v0, v2}, Led;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 2679
    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    if-ne v0, v4, :cond_f

    move v0, v9

    .line 2684
    :goto_b
    if-nez v0, :cond_e

    .line 2685
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v6

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v10

    invoke-direct {v0, v2, v5, v6, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v3, v4, v0}, Led;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2671
    :cond_e
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_9

    .line 2677
    :cond_f
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_a

    .line 2690
    :cond_10
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()V

    .line 2691
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->c()V

    move-object v6, v3

    .line 2708
    :goto_c
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    invoke-virtual {v1}, Lyz;->a()I

    move-result v1

    iput v1, v0, Lzp;->f:I

    .line 2709
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50042
    iput v8, v0, Lzp;->h:I

    .line 2712
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50043
    iput-boolean v8, v0, Lzp;->j:Z

    .line 2713
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, v1, v2}, Lzh;->c(Lzl;Lzp;)V

    .line 2715
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50044
    iput-boolean v8, v0, Lzp;->i:Z

    .line 2716
    iput-object v7, p0, Landroid/support/v7/widget/RecyclerView;->v:Lzn;

    .line 2719
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50045
    iget-boolean v0, v0, Lzp;->k:Z

    .line 2719
    if-eqz v0, :cond_14

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v0, :cond_14

    move v0, v9

    .line 50046
    :goto_d
    iput-boolean v0, v1, Lzp;->k:Z

    .line 2721
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50047
    iget-boolean v0, v0, Lzp;->k:Z

    .line 2721
    if-eqz v0, :cond_27

    .line 2723
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->d:Led;

    if-eqz v0, :cond_15

    new-instance v0, Led;

    invoke-direct {v0}, Led;-><init>()V

    move-object v10, v0

    .line 2725
    :goto_e
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->a()I

    move-result v12

    move v11, v8

    .line 2726
    :goto_f
    if-ge v11, v12, :cond_17

    .line 2727
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0, v11}, Lxb;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v1

    .line 2728
    invoke-virtual {v1}, Lzr;->b()Z

    move-result v0

    if-nez v0, :cond_11

    .line 2731
    iget-object v5, v1, Lzr;->a:Landroid/view/View;

    .line 2732
    invoke-direct {p0, v1}, Landroid/support/v7/widget/RecyclerView;->b(Lzr;)J

    move-result-wide v2

    .line 2733
    if-eqz v10, :cond_16

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->d:Led;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Led;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 2734
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0, v1}, Led;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2726
    :cond_11
    :goto_10
    add-int/lit8 v0, v11, 0x1

    move v11, v0

    goto :goto_f

    .line 2693
    :cond_12
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()V

    .line 2695
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->e()V

    .line 2696
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->d:Led;

    if-eqz v0, :cond_29

    .line 2697
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->a()I

    move-result v1

    move v0, v8

    .line 2698
    :goto_11
    if-ge v0, v1, :cond_29

    .line 2699
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v2, v0}, Lxb;->b(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v2

    .line 2700
    invoke-virtual {v2}, Lzr;->l()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {v2}, Lzr;->n()Z

    move-result v3

    if-nez v3, :cond_13

    invoke-virtual {v2}, Lzr;->b()Z

    move-result v3

    if-nez v3, :cond_13

    .line 2701
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Lzr;)J

    move-result-wide v4

    .line 2702
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v3, v3, Lzp;->d:Led;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Led;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2703
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v3, v3, Lzp;->b:Led;

    invoke-virtual {v3, v2}, Led;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2698
    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_11

    :cond_14
    move v0, v8

    .line 2719
    goto/16 :goto_d

    :cond_15
    move-object v10, v7

    .line 2723
    goto/16 :goto_e

    .line 2736
    :cond_16
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v13, v0, Lzp;->c:Led;

    new-instance v0, Lzg;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lzg;-><init>(Lzr;IIII)V

    invoke-virtual {v13, v1, v0}, Led;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_10

    .line 2740
    :cond_17
    invoke-direct {p0, v6}, Landroid/support/v7/widget/RecyclerView;->a(Led;)V

    .line 2742
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->b:Led;

    invoke-virtual {v0}, Led;->size()I

    move-result v0

    .line 2743
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_12
    if-ltz v1, :cond_19

    .line 2744
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->b:Led;

    invoke-virtual {v0, v1}, Led;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 2745
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v2, v2, Lzp;->c:Led;

    invoke-virtual {v2, v0}, Led;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    .line 2746
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->b:Led;

    invoke-virtual {v0, v1}, Led;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzg;

    .line 2747
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v2, v2, Lzp;->b:Led;

    invoke-virtual {v2, v1}, Led;->d(I)Ljava/lang/Object;

    .line 2750
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v3, v0, Lzg;->a:Lzr;

    invoke-virtual {v2, v3}, Lzl;->b(Lzr;)V

    .line 2751
    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Lzg;)V

    .line 2743
    :cond_18
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_12

    .line 2755
    :cond_19
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->c:Led;

    invoke-virtual {v0}, Led;->size()I

    move-result v0

    .line 2756
    if-lez v0, :cond_1f

    .line 2757
    add-int/lit8 v0, v0, -0x1

    move v11, v0

    :goto_13
    if-ltz v11, :cond_1f

    .line 2758
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->c:Led;

    invoke-virtual {v0, v11}, Led;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzr;

    .line 2759
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->c:Led;

    invoke-virtual {v0, v11}, Led;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzg;

    .line 2760
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v2, v2, Lzp;->b:Led;

    invoke-virtual {v2}, Led;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1a

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v2, v2, Lzp;->b:Led;

    invoke-virtual {v2, v1}, Led;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    .line 2762
    :cond_1a
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v2, v2, Lzp;->c:Led;

    invoke-virtual {v2, v11}, Led;->d(I)Ljava/lang/Object;

    .line 2763
    if-eqz v6, :cond_1d

    iget-object v2, v1, Lzr;->a:Landroid/view/View;

    invoke-virtual {v6, v2}, Led;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    move-object v3, v2

    .line 2765
    :goto_14
    iget v4, v0, Lzg;->b:I

    iget v5, v0, Lzg;->c:I

    .line 50049
    if-eqz v3, :cond_1e

    iget v0, v3, Landroid/graphics/Rect;->left:I

    if-ne v0, v4, :cond_1b

    iget v0, v3, Landroid/graphics/Rect;->top:I

    if-eq v0, v5, :cond_1e

    .line 50052
    :cond_1b
    invoke-virtual {v1, v8}, Lzr;->a(Z)V

    .line 50056
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    iget v2, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual/range {v0 .. v5}, Lzc;->a(Lzr;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 50059
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    .line 2757
    :cond_1c
    :goto_15
    add-int/lit8 v0, v11, -0x1

    move v11, v0

    goto :goto_13

    :cond_1d
    move-object v3, v7

    .line 2763
    goto :goto_14

    .line 50065
    :cond_1e
    invoke-virtual {v1, v8}, Lzr;->a(Z)V

    .line 50066
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    invoke-virtual {v0, v1}, Lzc;->b(Lzr;)Z

    .line 50067
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    goto :goto_15

    .line 2771
    :cond_1f
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->c:Led;

    invoke-virtual {v0}, Led;->size()I

    move-result v11

    move v6, v8

    .line 2772
    :goto_16
    if-ge v6, v11, :cond_22

    .line 2773
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->c:Led;

    invoke-virtual {v0, v6}, Led;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzr;

    .line 2774
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->c:Led;

    invoke-virtual {v0, v6}, Led;->c(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lzg;

    .line 2775
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->b:Led;

    invoke-virtual {v0, v1}, Led;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lzg;

    .line 2776
    if-eqz v3, :cond_21

    if-eqz v5, :cond_21

    .line 2777
    iget v0, v3, Lzg;->b:I

    iget v2, v5, Lzg;->b:I

    if-ne v0, v2, :cond_20

    iget v0, v3, Lzg;->c:I

    iget v2, v5, Lzg;->c:I

    if-eq v0, v2, :cond_21

    .line 2778
    :cond_20
    invoke-virtual {v1, v8}, Lzr;->a(Z)V

    .line 2783
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    iget v2, v3, Lzg;->b:I

    iget v3, v3, Lzg;->c:I

    iget v4, v5, Lzg;->b:I

    iget v5, v5, Lzg;->c:I

    invoke-virtual/range {v0 .. v5}, Lzc;->a(Lzr;IIII)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 2785
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    .line 2772
    :cond_21
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_16

    .line 2791
    :cond_22
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->d:Led;

    if-eqz v0, :cond_25

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->d:Led;

    invoke-virtual {v0}, Led;->size()I

    move-result v0

    .line 2793
    :goto_17
    add-int/lit8 v0, v0, -0x1

    move v11, v0

    :goto_18
    if-ltz v11, :cond_27

    .line 2794
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->d:Led;

    invoke-virtual {v0, v11}, Led;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 2795
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v0, v0, Lzp;->d:Led;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Led;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzr;

    .line 2797
    invoke-virtual {v1}, Lzr;->b()Z

    move-result v0

    if-nez v0, :cond_24

    .line 2802
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 50071
    iget-object v0, v0, Lzl;->b:Ljava/util/ArrayList;

    .line 2802
    if-eqz v0, :cond_24

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 50072
    iget-object v0, v0, Lzl;->b:Ljava/util/ArrayList;

    .line 2802
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 2804
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Led;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzr;

    .line 50073
    invoke-virtual {v1, v8}, Lzr;->a(Z)V

    .line 50074
    invoke-direct {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Lzr;)V

    .line 50075
    iput-object v2, v1, Lzr;->g:Lzr;

    .line 50076
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    invoke-virtual {v0, v1}, Lzl;->b(Lzr;)V

    .line 50080
    iget-object v0, v1, Lzr;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    .line 50081
    iget-object v0, v1, Lzr;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    .line 50083
    if-eqz v2, :cond_23

    invoke-virtual {v2}, Lzr;->b()Z

    move-result v0

    if-eqz v0, :cond_26

    :cond_23
    move v6, v4

    move v5, v3

    .line 50092
    :goto_19
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    invoke-virtual/range {v0 .. v6}, Lzc;->a(Lzr;Lzr;IIII)Z

    .line 50094
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    .line 2793
    :cond_24
    add-int/lit8 v0, v11, -0x1

    move v11, v0

    goto :goto_18

    :cond_25
    move v0, v8

    .line 2791
    goto :goto_17

    .line 50087
    :cond_26
    iget-object v0, v2, Lzr;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v5

    .line 50088
    iget-object v0, v2, Lzr;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v6

    .line 50089
    invoke-virtual {v2, v8}, Lzr;->a(Z)V

    .line 50090
    iput-object v1, v2, Lzr;->h:Lzr;

    goto :goto_19

    .line 2810
    :cond_27
    invoke-virtual {p0, v8}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 2811
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    invoke-virtual {v0, v1}, Lzh;->a(Lzl;)V

    .line 2812
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget v1, v1, Lzp;->f:I

    .line 50097
    iput v1, v0, Lzp;->g:I

    .line 2813
    iput-boolean v8, p0, Landroid/support/v7/widget/RecyclerView;->h:Z

    .line 2814
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50098
    iput-boolean v8, v0, Lzp;->k:Z

    .line 2815
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 50099
    iput-boolean v8, v0, Lzp;->l:Z

    .line 2816
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->r()V

    .line 2817
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-static {v0, v8}, Lzh;->a(Lzh;Z)Z

    .line 2818
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 50100
    iget-object v0, v0, Lzl;->b:Ljava/util/ArrayList;

    .line 2818
    if-eqz v0, :cond_28

    .line 2819
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 50101
    iget-object v0, v0, Lzl;->b:Ljava/util/ArrayList;

    .line 2819
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2821
    :cond_28
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iput-object v7, v0, Lzp;->d:Led;

    .line 2823
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ac:[I

    aget v0, v0, v8

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->ac:[I

    aget v1, v1, v9

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/RecyclerView;->f(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2824
    invoke-virtual {p0, v8, v8}, Landroid/support/v7/widget/RecyclerView;->c(II)V

    goto/16 :goto_0

    :cond_29
    move-object v6, v7

    goto/16 :goto_c

    :cond_2a
    move v0, v8

    goto/16 :goto_b

    :cond_2b
    move v0, v1

    move v1, v2

    goto/16 :goto_6
.end method

.method public hasNestedScrollingParent()Z
    .locals 1

    .prologue
    .line 8364
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Lgj;

    invoke-virtual {v0}, Lgj;->a()Z

    move-result v0

    return v0
.end method

.method public isAttachedToWindow()Z
    .locals 1

    .prologue
    .line 1910
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Z

    return v0
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    .prologue
    .line 8349
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Lgj;

    .line 50206
    iget-boolean v0, v0, Lgj;->c:Z

    .line 8349
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1879
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 1880
    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    .line 1881
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Z

    .line 1882
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    .line 1886
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->aa:Z

    .line 1887
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1891
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 1892
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v0, :cond_0

    .line 1893
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    invoke-virtual {v0}, Lzc;->d()V

    .line 1895
    :cond_0
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    .line 1897
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->l()V

    .line 1898
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->C:Z

    .line 1899
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v0, :cond_1

    .line 1900
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    .line 29634
    invoke-virtual {v0, p0, v1}, Lzh;->a(Landroid/support/v7/widget/RecyclerView;Lzl;)V

    .line 1902
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ah:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1903
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    .line 3098
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 3100
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 3101
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 3102
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->z:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3101
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3104
    :cond_0
    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 2286
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v0, :cond_1

    .line 2314
    :cond_0
    :goto_0
    return v7

    .line 2289
    :cond_1
    invoke-static {p1}, Lgd;->d(Landroid/view/MotionEvent;)I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 2290
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_0

    .line 2292
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->j()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2295
    const/16 v0, 0x9

    invoke-static {p1, v0}, Lgd;->e(Landroid/view/MotionEvent;I)F

    move-result v0

    neg-float v0, v0

    .line 2300
    :goto_1
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v2}, Lzh;->i()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2301
    const/16 v2, 0xa

    invoke-static {p1, v2}, Lgd;->e(Landroid/view/MotionEvent;I)F

    move-result v2

    .line 2307
    :goto_2
    cmpl-float v3, v0, v1

    if-nez v3, :cond_2

    cmpl-float v3, v2, v1

    if-eqz v3, :cond_0

    .line 30321
    :cond_2
    iget v3, p0, Landroid/support/v7/widget/RecyclerView;->U:F

    const/4 v4, 0x1

    cmpl-float v3, v3, v4

    if-nez v3, :cond_3

    .line 30322
    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 30323
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    const v5, 0x101004d

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v3, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 30325
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->U:F

    .line 30332
    :cond_3
    iget v1, p0, Landroid/support/v7/widget/RecyclerView;->U:F

    .line 2309
    :cond_4
    mul-float/2addr v2, v1

    float-to-int v2, v2

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-direct {p0, v2, v0, p1}, Landroid/support/v7/widget/RecyclerView;->a(IILandroid/view/MotionEvent;)Z

    goto :goto_0

    :cond_5
    move v0, v1

    .line 2298
    goto :goto_1

    :cond_6
    move v2, v1

    .line 2304
    goto :goto_2
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/4 v1, -0x1

    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 2027
    .line 29978
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    .line 29979
    if-eq v5, v9, :cond_0

    if-nez v5, :cond_1

    .line 29980
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->B:Ls;

    .line 29983
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v4, v3

    .line 29984
    :goto_0
    if-ge v4, v6, :cond_4

    .line 29985
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls;

    .line 29986
    invoke-interface {v0}, Ls;->a()Z

    move-result v7

    if-eqz v7, :cond_3

    if-eq v5, v9, :cond_3

    .line 29987
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->B:Ls;

    move v0, v2

    .line 2027
    :goto_1
    if-eqz v0, :cond_5

    .line 2028
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->p()V

    .line 2115
    :cond_2
    :goto_2
    return v2

    .line 29984
    :cond_3
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_4
    move v0, v3

    .line 29991
    goto :goto_1

    .line 2032
    :cond_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v0, :cond_6

    move v2, v3

    .line 2033
    goto :goto_2

    .line 2036
    :cond_6
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->i()Z

    move-result v0

    .line 2037
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v4}, Lzh;->j()Z

    move-result v4

    .line 2039
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    if-nez v5, :cond_7

    .line 2040
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v5

    iput-object v5, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    .line 2042
    :cond_7
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    invoke-virtual {v5, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2044
    invoke-static {p1}, Lgd;->a(Landroid/view/MotionEvent;)I

    move-result v5

    .line 2045
    invoke-static {p1}, Lgd;->b(Landroid/view/MotionEvent;)I

    move-result v6

    .line 2047
    packed-switch v5, :pswitch_data_0

    .line 2115
    :cond_8
    :goto_3
    :pswitch_0
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-eq v0, v2, :cond_2

    move v2, v3

    goto :goto_2

    .line 2049
    :pswitch_1
    invoke-static {p1, v3}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 2050
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    add-float/2addr v1, v8

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2051
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    add-float/2addr v1, v8

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    .line 2053
    iget v1, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    const/4 v5, 0x2

    if-ne v1, v5, :cond_9

    .line 2054
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2055
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 2059
    :cond_9
    if-eqz v0, :cond_10

    move v0, v2

    .line 2062
    :goto_4
    if-eqz v4, :cond_a

    .line 2063
    or-int/lit8 v0, v0, 0x2

    .line 2065
    :cond_a
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->startNestedScroll(I)Z

    goto :goto_3

    .line 2069
    :pswitch_2
    invoke-static {p1, v6}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 2070
    invoke-static {p1, v6}, Lgd;->c(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2071
    invoke-static {p1, v6}, Lgd;->d(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    goto :goto_3

    .line 2075
    :pswitch_3
    iget v5, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-static {p1, v5}, Lgd;->a(Landroid/view/MotionEvent;I)I

    move-result v5

    .line 2076
    if-gez v5, :cond_b

    .line 2077
    const-string v0, "RecyclerView"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error processing scroll; pointer index for id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not found. Did any MotionEvents get skipped?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    .line 2079
    goto/16 :goto_2

    .line 2082
    :cond_b
    invoke-static {p1, v5}, Lgd;->c(Landroid/view/MotionEvent;I)F

    move-result v6

    add-float/2addr v6, v8

    float-to-int v6, v6

    .line 2083
    invoke-static {p1, v5}, Lgd;->d(Landroid/view/MotionEvent;I)F

    move-result v5

    add-float/2addr v5, v8

    float-to-int v5, v5

    .line 2084
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-eq v7, v2, :cond_8

    .line 2085
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    sub-int/2addr v6, v7

    .line 2086
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    sub-int/2addr v5, v7

    .line 2088
    if-eqz v0, :cond_f

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-le v0, v7, :cond_f

    .line 2089
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    iget v8, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-gez v6, :cond_d

    move v0, v1

    :goto_5
    mul-int/2addr v0, v8

    add-int/2addr v0, v7

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    move v0, v2

    .line 2092
    :goto_6
    if-eqz v4, :cond_c

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v6, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-le v4, v6, :cond_c

    .line 2093
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-gez v5, :cond_e

    :goto_7
    mul-int/2addr v1, v4

    add-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    move v0, v2

    .line 2096
    :cond_c
    if-eqz v0, :cond_8

    .line 2097
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    goto/16 :goto_3

    :cond_d
    move v0, v2

    .line 2089
    goto :goto_5

    :cond_e
    move v1, v2

    .line 2093
    goto :goto_7

    .line 2103
    :pswitch_4
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    .line 2107
    :pswitch_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2108
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->stopNestedScroll()V

    goto/16 :goto_3

    .line 2112
    :pswitch_6
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->p()V

    goto/16 :goto_3

    :cond_f
    move v0, v3

    goto :goto_6

    :cond_10
    move v0, v3

    goto/16 :goto_4

    .line 2047
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_3
        :pswitch_6
        :pswitch_0
        :pswitch_2
        :pswitch_4
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 3009
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->a()V

    .line 3010
    const-string v0, "RV OnLayout"

    invoke-static {v0}, La;->a(Ljava/lang/String;)V

    .line 3011
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->h()V

    .line 3012
    invoke-static {}, La;->b()V

    .line 3013
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 3014
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    .line 3015
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2337
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Z

    if-eqz v0, :cond_0

    .line 2338
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->a()V

    .line 2339
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->t()V

    .line 2341
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 31040
    iget-boolean v0, v0, Lzp;->l:Z

    .line 2341
    if-eqz v0, :cond_1

    .line 2346
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    const/4 v1, 0x1

    .line 32040
    iput-boolean v1, v0, Lzp;->j:Z

    .line 2352
    :goto_0
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->G:Z

    .line 2353
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 2356
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    if-eqz v0, :cond_2

    .line 2357
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->d:Lyz;

    invoke-virtual {v1}, Lyz;->a()I

    move-result v1

    iput v1, v0, Lzp;->f:I

    .line 2361
    :goto_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v0, :cond_3

    .line 2362
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->e(II)V

    .line 2367
    :goto_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 35040
    iput-boolean v2, v0, Lzp;->j:Z

    .line 2368
    return-void

    .line 2349
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Lwh;

    invoke-virtual {v0}, Lwh;->e()V

    .line 2350
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 33040
    iput-boolean v2, v0, Lzp;->j:Z

    goto :goto_0

    .line 2359
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    iput v2, v0, Lzp;->f:I

    goto :goto_1

    .line 2364
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 33279
    iget-object v0, v0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    .line 34139
    invoke-direct {v0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->e(II)V

    goto :goto_2
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .prologue
    .line 966
    check-cast p1, Lzn;

    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->v:Lzn;

    .line 967
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->v:Lzn;

    invoke-virtual {v0}, Lzn;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 968
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->v:Lzn;

    iget-object v0, v0, Lzn;->a:Landroid/os/Parcelable;

    if-eqz v0, :cond_0

    .line 969
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->v:Lzn;

    iget-object v1, v1, Lzn;->a:Landroid/os/Parcelable;

    invoke-virtual {v0, v1}, Lzh;->a(Landroid/os/Parcelable;)V

    .line 971
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 952
    new-instance v0, Lzn;

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Lzn;-><init>(Landroid/os/Parcelable;)V

    .line 953
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->v:Lzn;

    if-eqz v1, :cond_0

    .line 954
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->v:Lzn;

    invoke-static {v0, v1}, Lzn;->a(Lzn;Lzn;)V

    .line 961
    :goto_0
    return-object v0

    .line 955
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v1, :cond_1

    .line 956
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v1}, Lzh;->h()Landroid/os/Parcelable;

    move-result-object v1

    iput-object v1, v0, Lzn;->a:Landroid/os/Parcelable;

    goto :goto_0

    .line 958
    :cond_1
    const/4 v1, 0x0

    iput-object v1, v0, Lzn;->a:Landroid/os/Parcelable;

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 2409
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    .line 2410
    if-ne p1, p3, :cond_0

    if-eq p2, p4, :cond_1

    .line 2411
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->o()V

    .line 2413
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .prologue
    const/4 v5, 0x0

    const/4 v1, 0x0

    const/high16 v10, 0x3f000000    # 0.5f

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 2130
    .line 29995
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 29996
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->B:Ls;

    if-eqz v4, :cond_0

    .line 29997
    if-nez v0, :cond_2

    .line 29999
    iput-object v5, p0, Landroid/support/v7/widget/RecyclerView;->B:Ls;

    .line 30012
    :cond_0
    if-eqz v0, :cond_6

    .line 30013
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v4, v2

    .line 30014
    :goto_0
    if-ge v4, v5, :cond_6

    .line 30015
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls;

    .line 30016
    invoke-interface {v0}, Ls;->a()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 30017
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->B:Ls;

    move v0, v3

    .line 2130
    :goto_1
    if-eqz v0, :cond_7

    .line 2131
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->p()V

    move v2, v3

    .line 2261
    :cond_1
    :goto_2
    return v2

    .line 30002
    :cond_2
    const/4 v4, 0x3

    if-eq v0, v4, :cond_3

    if-ne v0, v3, :cond_4

    .line 30004
    :cond_3
    iput-object v5, p0, Landroid/support/v7/widget/RecyclerView;->B:Ls;

    :cond_4
    move v0, v3

    .line 30006
    goto :goto_1

    .line 30014
    :cond_5
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_6
    move v0, v2

    .line 30022
    goto :goto_1

    .line 2135
    :cond_7
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-eqz v0, :cond_1

    .line 2139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->i()Z

    move-result v5

    .line 2140
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v0}, Lzh;->j()Z

    move-result v6

    .line 2142
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    if-nez v0, :cond_8

    .line 2143
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    .line 2145
    :cond_8
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2147
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v7

    .line 2148
    invoke-static {p1}, Lgd;->a(Landroid/view/MotionEvent;)I

    move-result v0

    .line 2149
    invoke-static {p1}, Lgd;->b(Landroid/view/MotionEvent;)I

    move-result v4

    .line 2151
    if-nez v0, :cond_9

    .line 2152
    iget-object v8, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    iget-object v9, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aput v2, v9, v3

    aput v2, v8, v2

    .line 2154
    :cond_9
    iget-object v8, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aget v8, v8, v2

    int-to-float v8, v8

    iget-object v9, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aget v9, v9, v3

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 2156
    packed-switch v0, :pswitch_data_0

    .line 2259
    :cond_a
    :goto_3
    :pswitch_0
    invoke-virtual {v7}, Landroid/view/MotionEvent;->recycle()V

    move v2, v3

    .line 2261
    goto :goto_2

    .line 2158
    :pswitch_1
    invoke-static {p1, v2}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 2159
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2160
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    .line 2163
    if-eqz v5, :cond_1a

    move v0, v3

    .line 2166
    :goto_4
    if-eqz v6, :cond_b

    .line 2167
    or-int/lit8 v0, v0, 0x2

    .line 2169
    :cond_b
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->startNestedScroll(I)Z

    goto :goto_3

    .line 2173
    :pswitch_2
    invoke-static {p1, v4}, Lgd;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 2174
    invoke-static {p1, v4}, Lgd;->c(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2175
    invoke-static {p1, v4}, Lgd;->d(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    goto :goto_3

    .line 2179
    :pswitch_3
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-static {p1, v0}, Lgd;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 2180
    if-gez v0, :cond_c

    .line 2181
    const-string v0, "RecyclerView"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Error processing scroll; pointer index for id "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " not found. Did any MotionEvents get skipped?"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_2

    .line 2186
    :cond_c
    invoke-static {p1, v0}, Lgd;->c(Landroid/view/MotionEvent;I)F

    move-result v1

    add-float/2addr v1, v10

    float-to-int v8, v1

    .line 2187
    invoke-static {p1, v0}, Lgd;->d(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v9, v0

    .line 2188
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    sub-int v1, v0, v8

    .line 2189
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    sub-int/2addr v0, v9

    .line 2191
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->af:[I

    iget-object v10, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    invoke-virtual {p0, v1, v0, v4, v10}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedPreScroll(II[I[I)Z

    move-result v4

    if-eqz v4, :cond_d

    .line 2192
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->af:[I

    aget v4, v4, v2

    sub-int/2addr v1, v4

    .line 2193
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->af:[I

    aget v4, v4, v3

    sub-int/2addr v0, v4

    .line 2194
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    aget v4, v4, v2

    int-to-float v4, v4

    iget-object v10, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    aget v10, v10, v3

    int-to-float v10, v10

    invoke-virtual {v7, v4, v10}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 2196
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aget v10, v4, v2

    iget-object v11, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    aget v11, v11, v2

    add-int/2addr v10, v11

    aput v10, v4, v2

    .line 2197
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aget v10, v4, v3

    iget-object v11, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    aget v11, v11, v3

    add-int/2addr v10, v11

    aput v10, v4, v3

    .line 2200
    :cond_d
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-eq v4, v3, :cond_f

    .line 2202
    if-eqz v5, :cond_19

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v10, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-le v4, v10, :cond_19

    .line 2203
    if-lez v1, :cond_10

    .line 2204
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    sub-int/2addr v1, v4

    :goto_5
    move v4, v3

    .line 2210
    :goto_6
    if-eqz v6, :cond_e

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v10

    iget v11, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-le v10, v11, :cond_e

    .line 2211
    if-lez v0, :cond_11

    .line 2212
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    sub-int/2addr v0, v4

    :goto_7
    move v4, v3

    .line 2218
    :cond_e
    if-eqz v4, :cond_f

    .line 2219
    invoke-direct {p0, v3}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 2223
    :cond_f
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-ne v4, v3, :cond_a

    .line 2224
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    aget v4, v4, v2

    sub-int v4, v8, v4

    iput v4, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    .line 2225
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    aget v4, v4, v3

    sub-int v4, v9, v4

    iput v4, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    .line 2227
    if-eqz v5, :cond_12

    :goto_8
    if-eqz v6, :cond_13

    :goto_9
    invoke-direct {p0, v1, v0, v7}, Landroid/support/v7/widget/RecyclerView;->a(IILandroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2231
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_3

    .line 2206
    :cond_10
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    add-int/2addr v1, v4

    goto :goto_5

    .line 2214
    :cond_11
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    add-int/2addr v0, v4

    goto :goto_7

    :cond_12
    move v1, v2

    .line 2227
    goto :goto_8

    :cond_13
    move v0, v2

    goto :goto_9

    .line 2237
    :pswitch_4
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    .line 2241
    :pswitch_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    const/16 v4, 0x3e8

    iget v8, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    int-to-float v8, v8

    invoke-virtual {v0, v4, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 2242
    if-eqz v5, :cond_17

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-static {v0, v4}, Lgp;->a(Landroid/view/VelocityTracker;I)F

    move-result v0

    neg-float v0, v0

    move v4, v0

    .line 2244
    :goto_a
    if-eqz v6, :cond_18

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    iget v5, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-static {v0, v5}, Lgp;->b(Landroid/view/VelocityTracker;I)F

    move-result v0

    neg-float v0, v0

    .line 2246
    :goto_b
    cmpl-float v5, v4, v1

    if-nez v5, :cond_14

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_15

    :cond_14
    float-to-int v1, v4

    float-to-int v0, v0

    invoke-virtual {p0, v1, v0}, Landroid/support/v7/widget/RecyclerView;->b(II)Z

    move-result v0

    if-nez v0, :cond_16

    .line 2247
    :cond_15
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 2250
    :cond_16
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2251
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->n()V

    goto/16 :goto_3

    :cond_17
    move v4, v1

    .line 2242
    goto :goto_a

    :cond_18
    move v0, v1

    .line 2244
    goto :goto_b

    .line 2255
    :pswitch_6
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->p()V

    goto/16 :goto_3

    :cond_19
    move v4, v2

    goto/16 :goto_6

    :cond_1a
    move v0, v2

    goto/16 :goto_4

    .line 2156
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_3
        :pswitch_6
        :pswitch_0
        :pswitch_2
        :pswitch_4
    .end packed-switch
.end method

.method public removeDetachedView(Landroid/view/View;Z)V
    .locals 4

    .prologue
    .line 2874
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v0

    .line 2875
    if-eqz v0, :cond_0

    .line 2876
    invoke-virtual {v0}, Lzr;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2877
    invoke-virtual {v0}, Lzr;->i()V

    .line 50102
    :cond_0
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    .line 2884
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    .line 2885
    return-void

    .line 2878
    :cond_1
    invoke-virtual {v0}, Lzr;->b()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2879
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Called removeDetachedView with a view which is not flagged as tmp detached."

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1839
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 27047
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 1839
    :goto_0
    if-nez v0, :cond_1

    if-eqz p2, :cond_1

    .line 1840
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v0, v2, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 1845
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1846
    instance-of v3, v0, Lzi;

    if-eqz v3, :cond_0

    .line 1848
    check-cast v0, Lzi;

    .line 1849
    iget-boolean v3, v0, Lzi;->e:Z

    if-nez v3, :cond_0

    .line 1850
    iget-object v0, v0, Lzi;->d:Landroid/graphics/Rect;

    .line 1851
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v4, v5

    iput v4, v3, Landroid/graphics/Rect;->left:I

    .line 1852
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->right:I

    iget v5, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v5

    iput v4, v3, Landroid/graphics/Rect;->right:I

    .line 1853
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->top:I

    iget v5, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v4, v5

    iput v4, v3, Landroid/graphics/Rect;->top:I

    .line 1854
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v4

    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    .line 1858
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, p2, v0}, Landroid/support/v7/widget/RecyclerView;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1859
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/RecyclerView;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1860
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->y:Landroid/graphics/Rect;

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {p0, p1, v3, v0}, Landroid/support/v7/widget/RecyclerView;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 1862
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    .line 1863
    return-void

    :cond_2
    move v0, v2

    .line 27047
    goto :goto_0

    :cond_3
    move v0, v2

    .line 1860
    goto :goto_1
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 13

    .prologue
    .line 1867
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    .line 27999
    invoke-virtual {v3}, Lzh;->q()I

    move-result v4

    .line 28000
    invoke-virtual {v3}, Lzh;->r()I

    move-result v5

    .line 28001
    invoke-virtual {v3}, Lzh;->o()I

    move-result v0

    invoke-virtual {v3}, Lzh;->s()I

    move-result v1

    sub-int v6, v0, v1

    .line 28002
    invoke-virtual {v3}, Lzh;->p()I

    move-result v0

    invoke-virtual {v3}, Lzh;->t()I

    move-result v1

    sub-int v7, v0, v1

    .line 28003
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, p2, Landroid/graphics/Rect;->left:I

    add-int v8, v0, v1

    .line 28004
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iget v1, p2, Landroid/graphics/Rect;->top:I

    add-int v9, v0, v1

    .line 28005
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    add-int v10, v8, v0

    .line 28006
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v0

    add-int v11, v9, v0

    .line 28008
    const/4 v0, 0x0

    sub-int v1, v8, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 28009
    const/4 v0, 0x0

    sub-int v2, v9, v5

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 28010
    const/4 v0, 0x0

    sub-int v12, v10, v6

    invoke-static {v0, v12}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 28011
    const/4 v12, 0x0

    sub-int v7, v11, v7

    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 28967
    iget-object v3, v3, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3}, Lgt;->g(Landroid/view/View;)I

    move-result v3

    .line 28017
    const/4 v11, 0x1

    if-ne v3, v11, :cond_2

    .line 28018
    if-eqz v0, :cond_1

    :goto_0
    move v1, v0

    .line 28027
    :goto_1
    if-eqz v2, :cond_4

    move v0, v2

    .line 28030
    :goto_2
    if-nez v1, :cond_0

    if-eqz v0, :cond_6

    .line 28031
    :cond_0
    if-eqz p3, :cond_5

    .line 28032
    invoke-virtual {p0, v1, v0}, Landroid/support/v7/widget/RecyclerView;->scrollBy(II)V

    .line 28036
    :goto_3
    const/4 v0, 0x1

    :goto_4
    return v0

    .line 28018
    :cond_1
    sub-int v0, v10, v6

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    .line 28021
    :cond_2
    if-eqz v1, :cond_3

    move v0, v1

    :goto_5
    move v1, v0

    goto :goto_1

    :cond_3
    sub-int v1, v8, v4

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_5

    .line 28027
    :cond_4
    sub-int v0, v9, v5

    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_2

    .line 28034
    :cond_5
    invoke-virtual {p0, v1, v0}, Landroid/support/v7/widget/RecyclerView;->a(II)V

    goto :goto_3

    .line 28038
    :cond_6
    const/4 v0, 0x0

    .line 1867
    goto :goto_4
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 3

    .prologue
    .line 2120
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 2121
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 2122
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->A:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2121
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2125
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 2126
    return-void
.end method

.method public requestLayout()V
    .locals 1

    .prologue
    .line 3019
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    if-nez v0, :cond_0

    .line 3020
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 3024
    :goto_0
    return-void

    .line 3022
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    goto :goto_0
.end method

.method public scrollBy(II)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1314
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    if-nez v1, :cond_1

    .line 1315
    const-string v0, "RecyclerView"

    const-string v1, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1324
    :cond_0
    :goto_0
    return-void

    .line 1319
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v1}, Lzh;->i()Z

    move-result v1

    .line 1320
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Lzh;

    invoke-virtual {v2}, Lzh;->j()Z

    move-result v2

    .line 1321
    if-nez v1, :cond_2

    if-eqz v2, :cond_0

    .line 1322
    :cond_2
    if-eqz v1, :cond_3

    :goto_1
    if-eqz v2, :cond_4

    :goto_2
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/RecyclerView;->a(IILandroid/view/MotionEvent;)Z

    goto :goto_0

    :cond_3
    move p1, v0

    goto :goto_1

    :cond_4
    move p2, v0

    goto :goto_2
.end method

.method public scrollTo(II)V
    .locals 2

    .prologue
    .line 1308
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "RecyclerView does not support scrolling to an absolute position."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 2512
    .line 37496
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 37498
    if-eqz p1, :cond_3

    .line 37499
    invoke-static {p1}, Liz;->b(Landroid/view/accessibility/AccessibilityEvent;)I

    move-result v1

    .line 37501
    :goto_0
    if-nez v1, :cond_2

    .line 37504
    :goto_1
    iget v1, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    .line 37505
    const/4 v0, 0x1

    .line 2512
    :cond_0
    if-eqz v0, :cond_1

    .line 2516
    :goto_2
    return-void

    .line 2515
    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_2

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    move v1, v0

    goto :goto_0
.end method

.method public setClipToPadding(Z)V
    .locals 1

    .prologue
    .line 714
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eq p1, v0, :cond_0

    .line 715
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->o()V

    .line 717
    :cond_0
    iput-boolean p1, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    .line 718
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 719
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    if-eqz v0, :cond_1

    .line 720
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 722
    :cond_1
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 2

    .prologue
    .line 8344
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Lgj;

    .line 50201
    iget-boolean v1, v0, Lgj;->c:Z

    if-eqz v1, :cond_0

    .line 50202
    iget-object v1, v0, Lgj;->a:Landroid/view/View;

    invoke-static {v1}, Lgt;->t(Landroid/view/View;)V

    .line 50204
    :cond_0
    iput-boolean p1, v0, Lgj;->c:Z

    .line 8345
    return-void
.end method

.method public startNestedScroll(I)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    .line 8354
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ad:Lgj;

    .line 50207
    invoke-virtual {v3}, Lgj;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    .line 50218
    :goto_0
    return v0

    .line 50227
    :cond_0
    iget-boolean v0, v3, Lgj;->c:Z

    .line 50211
    if-eqz v0, :cond_3

    .line 50212
    iget-object v0, v3, Lgj;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 50213
    iget-object v0, v3, Lgj;->a:Landroid/view/View;

    .line 50214
    :goto_1
    if-eqz v1, :cond_3

    .line 50215
    iget-object v4, v3, Lgj;->a:Landroid/view/View;

    invoke-static {v1, v0, v4, p1}, Lic;->a(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 50216
    iput-object v1, v3, Lgj;->b:Landroid/view/ViewParent;

    .line 50217
    iget-object v3, v3, Lgj;->a:Landroid/view/View;

    invoke-static {v1, v0, v3, p1}, Lic;->b(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)V

    move v0, v2

    .line 50218
    goto :goto_0

    .line 50220
    :cond_1
    instance-of v4, v1, Landroid/view/View;

    if-eqz v4, :cond_2

    move-object v0, v1

    .line 50221
    check-cast v0, Landroid/view/View;

    .line 50223
    :cond_2
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_1

    .line 50226
    :cond_3
    const/4 v0, 0x0

    .line 8354
    goto :goto_0
.end method

.method public stopNestedScroll()V
    .locals 3

    .prologue
    .line 8359
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Lgj;

    .line 50228
    iget-object v1, v0, Lgj;->b:Landroid/view/ViewParent;

    if-eqz v1, :cond_0

    .line 50229
    iget-object v1, v0, Lgj;->b:Landroid/view/ViewParent;

    iget-object v2, v0, Lgj;->a:Landroid/view/View;

    invoke-static {v1, v2}, Lic;->a(Landroid/view/ViewParent;Landroid/view/View;)V

    .line 50230
    const/4 v1, 0x0

    iput-object v1, v0, Lgj;->b:Landroid/view/ViewParent;

    .line 8360
    :cond_0
    return-void
.end method
