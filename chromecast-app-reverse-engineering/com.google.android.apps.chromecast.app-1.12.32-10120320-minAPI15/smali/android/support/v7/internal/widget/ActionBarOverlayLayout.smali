.class public Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
.super Landroid/view/ViewGroup;
.source "PG"

# interfaces
.implements Lgk;
.implements Lsd;


# static fields
.field private static C:[I


# instance fields
.field private final A:Ljava/lang/Runnable;

.field private final B:Ljava/lang/Runnable;

.field private final D:Lgl;

.field public a:I

.field public b:Z

.field public c:Z

.field public d:I

.field public e:Lrj;

.field private f:I

.field private g:Landroid/support/v7/internal/widget/ContentFrameLayout;

.field private h:Landroid/support/v7/internal/widget/ActionBarContainer;

.field private i:Landroid/support/v7/internal/widget/ActionBarContainer;

.field private j:Lse;

.field private k:Landroid/graphics/drawable/Drawable;

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:I

.field private final p:Landroid/graphics/Rect;

.field private final q:Landroid/graphics/Rect;

.field private final r:Landroid/graphics/Rect;

.field private final s:Landroid/graphics/Rect;

.field private final t:Landroid/graphics/Rect;

.field private final u:Landroid/graphics/Rect;

.field private v:Llr;

.field private w:Lih;

.field private x:Lih;

.field private final y:Liu;

.field private final z:Liu;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 149
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, La;->h:I

    aput v2, v0, v1

    const/4 v1, 0x1

    const v2, 0x1010059

    aput v2, v0, v1

    sput-object v0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->C:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 157
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 158
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 161
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a:I

    .line 77
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->p:Landroid/graphics/Rect;

    .line 78
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->q:Landroid/graphics/Rect;

    .line 79
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->r:Landroid/graphics/Rect;

    .line 80
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->s:Landroid/graphics/Rect;

    .line 81
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->t:Landroid/graphics/Rect;

    .line 82
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->u:Landroid/graphics/Rect;

    .line 93
    new-instance v0, Lrf;

    invoke-direct {v0, p0}, Lrf;-><init>(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->y:Liu;

    .line 108
    new-instance v0, Lrg;

    invoke-direct {v0, p0}, Lrg;-><init>(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->z:Liu;

    .line 123
    new-instance v0, Lrh;

    invoke-direct {v0, p0}, Lrh;-><init>(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->A:Ljava/lang/Runnable;

    .line 135
    new-instance v0, Lri;

    invoke-direct {v0, p0}, Lri;-><init>(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->B:Ljava/lang/Runnable;

    .line 162
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a(Landroid/content/Context;)V

    .line 164
    new-instance v0, Lgl;

    invoke-direct {v0, p0}, Lgl;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->D:Lgl;

    .line 165
    return-void
.end method

.method public static synthetic a(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;Lih;)Lih;
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->w:Lih;

    return-object p1
.end method

.method public static a()V
    .locals 0

    .prologue
    .line 239
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 168
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v3, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->C:[I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 169
    invoke-virtual {v3, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->f:I

    .line 170
    invoke-virtual {v3, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->k:Landroid/graphics/drawable/Drawable;

    .line 171
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->k:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->setWillNotDraw(Z)V

    .line 172
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 174
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v3, 0x13

    if-ge v0, v3, :cond_1

    :goto_1
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->l:Z

    .line 1246
    const/4 v0, 0x0

    invoke-static {p1, v0}, Llr;->a(Landroid/content/Context;Landroid/view/animation/Interpolator;)Llr;

    move-result-object v0

    .line 177
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->v:Llr;

    .line 178
    return-void

    :cond_0
    move v0, v2

    .line 171
    goto :goto_0

    :cond_1
    move v1, v2

    .line 174
    goto :goto_1
.end method

.method public static synthetic a(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j()V

    return-void
.end method

.method public static synthetic a(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;Z)Z
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->n:Z

    return v0
.end method

.method private static a(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    .line 284
    const/4 v1, 0x0

    .line 285
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lrk;

    .line 286
    iget v3, v0, Lrk;->leftMargin:I

    iget v4, p1, Landroid/graphics/Rect;->left:I

    if-eq v3, v4, :cond_0

    .line 288
    iget v1, p1, Landroid/graphics/Rect;->left:I

    iput v1, v0, Lrk;->leftMargin:I

    move v1, v2

    .line 290
    :cond_0
    if-eqz p3, :cond_1

    iget v3, v0, Lrk;->topMargin:I

    iget v4, p1, Landroid/graphics/Rect;->top:I

    if-eq v3, v4, :cond_1

    .line 292
    iget v1, p1, Landroid/graphics/Rect;->top:I

    iput v1, v0, Lrk;->topMargin:I

    move v1, v2

    .line 294
    :cond_1
    iget v3, v0, Lrk;->rightMargin:I

    iget v4, p1, Landroid/graphics/Rect;->right:I

    if-eq v3, v4, :cond_2

    .line 296
    iget v1, p1, Landroid/graphics/Rect;->right:I

    iput v1, v0, Lrk;->rightMargin:I

    move v1, v2

    .line 298
    :cond_2
    if-eqz p4, :cond_3

    iget v3, v0, Lrk;->bottomMargin:I

    iget v4, p1, Landroid/graphics/Rect;->bottom:I

    if-eq v3, v4, :cond_3

    .line 300
    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    iput v1, v0, Lrk;->bottomMargin:I

    .line 302
    :goto_0
    return v2

    :cond_3
    move v2, v1

    goto :goto_0
.end method

.method public static synthetic b(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;Lih;)Lih;
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->x:Lih;

    return-object p1
.end method

.method public static synthetic b(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;)Liu;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->y:Liu;

    return-object v0
.end method

.method private b(I)V
    .locals 4

    .prologue
    .line 623
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j()V

    .line 624
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I

    move-result v0

    .line 625
    const/4 v1, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 626
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    neg-int v3, v1

    int-to-float v3, v3

    invoke-static {v2, v3}, Lgt;->b(Landroid/view/View;F)V

    .line 627
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    .line 629
    int-to-float v1, v1

    int-to-float v0, v0

    div-float v0, v1, v0

    .line 630
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 631
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    int-to-float v0, v0

    invoke-static {v1, v0}, Lgt;->b(Landroid/view/View;F)V

    .line 633
    :cond_0
    return-void
.end method

.method public static synthetic c(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;)Landroid/support/v7/internal/widget/ActionBarContainer;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    return-object v0
.end method

.method public static synthetic d(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;)Landroid/support/v7/internal/widget/ActionBarContainer;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    return-object v0
.end method

.method public static synthetic e(Landroid/support/v7/internal/widget/ActionBarOverlayLayout;)Liu;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->z:Liu;

    return-object v0
.end method

.method private i()V
    .locals 4

    .prologue
    .line 585
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->g:Landroid/support/v7/internal/widget/ContentFrameLayout;

    if-nez v0, :cond_0

    .line 586
    sget v0, La;->aQ:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ContentFrameLayout;

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->g:Landroid/support/v7/internal/widget/ContentFrameLayout;

    .line 587
    sget v0, La;->aR:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 588
    sget v0, La;->aP:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 6594
    instance-of v1, v0, Lse;

    if-eqz v1, :cond_1

    .line 6595
    check-cast v0, Lse;

    .line 588
    :goto_0
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    .line 589
    sget v0, La;->bu:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 591
    :cond_0
    return-void

    .line 6596
    :cond_1
    instance-of v1, v0, Landroid/support/v7/widget/Toolbar;

    if-eqz v1, :cond_2

    .line 6597
    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->h()Lse;

    move-result-object v0

    goto :goto_0

    .line 6599
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Can\'t make a decor toolbar out of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private j()V
    .locals 1

    .prologue
    .line 636
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->A:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 637
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->B:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 638
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->w:Lih;

    if-eqz v0, :cond_0

    .line 639
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->w:Lih;

    invoke-virtual {v0}, Lih;->a()V

    .line 641
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->x:Lih;

    if-eqz v0, :cond_1

    .line 642
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->x:Lih;

    invoke-virtual {v0}, Lih;->a()V

    .line 644
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 692
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 693
    sparse-switch p1, :sswitch_data_0

    .line 704
    :goto_0
    :sswitch_0
    return-void

    .line 7201
    :sswitch_1
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->b:Z

    .line 7207
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v2, 0x13

    if-ge v1, v2, :cond_0

    :goto_1
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->l:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 693
    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x5 -> :sswitch_0
        0x9 -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(Landroid/view/Menu;Lqq;)V
    .locals 1

    .prologue
    .line 779
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 780
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    invoke-interface {v0, p1, p2}, Lse;->a(Landroid/view/Menu;Lqq;)V

    .line 781
    return-void
.end method

.method public final a(Landroid/view/Window$Callback;)V
    .locals 1

    .prologue
    .line 674
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 675
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    invoke-interface {v0, p1}, Lse;->a(Landroid/view/Window$Callback;)V

    .line 676
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 680
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 681
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    invoke-interface {v0, p1}, Lse;->a(Ljava/lang/CharSequence;)V

    .line 682
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 605
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->m:Z

    if-eq p1, v0, :cond_0

    .line 606
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->m:Z

    .line 607
    if-nez p1, :cond_0

    .line 608
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j()V

    .line 609
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->b(I)V

    .line 612
    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 743
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 744
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    invoke-interface {v0}, Lse;->f()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 749
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 750
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    invoke-interface {v0}, Lse;->g()Z

    move-result v0

    return v0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 354
    instance-of v0, p1, Lrk;

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 755
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 756
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    invoke-interface {v0}, Lse;->h()Z

    move-result v0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 500
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 501
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->k:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->l:Z

    if-nez v0, :cond_0

    .line 502
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getBottom()I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v2}, Lgt;->l(Landroid/view/View;)F

    move-result v2

    add-float/2addr v0, v2

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v0, v2

    float-to-int v0, v0

    .line 505
    :goto_0
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getWidth()I

    move-result v3

    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    add-int/2addr v4, v0

    invoke-virtual {v2, v1, v0, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 507
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 509
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 502
    goto :goto_0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 761
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 762
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    invoke-interface {v0}, Lse;->i()Z

    move-result v0

    return v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 767
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 768
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    invoke-interface {v0}, Lse;->j()Z

    move-result v0

    return v0
.end method

.method protected fitSystemWindows(Landroid/graphics/Rect;)Z
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/4 v2, 0x1

    .line 307
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 309
    invoke-static {p0}, Lgt;->p(Landroid/view/View;)I

    .line 314
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    move-object v1, p1

    move v3, v2

    move v5, v2

    invoke-static/range {v0 .. v5}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z

    move-result v0

    .line 315
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v1, :cond_0

    .line 316
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    move-object v6, p1

    move v7, v2

    move v8, v4

    move v9, v2

    move v10, v2

    invoke-static/range {v5 .. v10}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z

    move-result v1

    or-int/2addr v0, v1

    .line 319
    :cond_0
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->s:Landroid/graphics/Rect;

    invoke-virtual {v1, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 320
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->s:Landroid/graphics/Rect;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->p:Landroid/graphics/Rect;

    invoke-static {p0, v1, v3}, Ltm;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 321
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->q:Landroid/graphics/Rect;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->p:Landroid/graphics/Rect;

    invoke-virtual {v1, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 323
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->q:Landroid/graphics/Rect;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->p:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    move v0, v2

    .line 326
    :cond_1
    if-eqz v0, :cond_2

    .line 327
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->requestLayout()V

    .line 334
    :cond_2
    return v2
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 773
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 774
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    invoke-interface {v0}, Lse;->k()V

    .line 775
    return-void
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 7339
    new-instance v0, Lrk;

    invoke-direct {v0, v1, v1}, Lrk;-><init>(II)V

    .line 51
    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 51
    .line 7344
    new-instance v0, Lrk;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lrk;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 349
    new-instance v0, Lrk;

    invoke-direct {v0, p1}, Lrk;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .prologue
    .line 581
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->D:Lgl;

    .line 6069
    iget v0, v0, Lgl;->a:I

    .line 581
    return v0
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 797
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 798
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j:Lse;

    invoke-interface {v0}, Lse;->l()V

    .line 799
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 242
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    .line 243
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 245
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a(Landroid/content/Context;)V

    .line 246
    invoke-static {p0}, Lgt;->q(Landroid/view/View;)V

    .line 247
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 182
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 183
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j()V

    .line 184
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 11

    .prologue
    .line 469
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getChildCount()I

    move-result v2

    .line 471
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getPaddingLeft()I

    move-result v3

    .line 472
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getPaddingRight()I

    .line 474
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getPaddingTop()I

    move-result v4

    .line 475
    sub-int v0, p5, p3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getPaddingBottom()I

    move-result v1

    sub-int v5, v0, v1

    .line 477
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_2

    .line 478
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 479
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v7, 0x8

    if-eq v0, v7, :cond_0

    .line 480
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lrk;

    .line 482
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 483
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    .line 485
    iget v9, v0, Lrk;->leftMargin:I

    add-int/2addr v9, v3

    .line 487
    iget-object v10, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-ne v6, v10, :cond_1

    .line 488
    sub-int v10, v5, v8

    iget v0, v0, Lrk;->bottomMargin:I

    sub-int v0, v10, v0

    .line 493
    :goto_1
    add-int/2addr v7, v9

    add-int/2addr v8, v0

    invoke-virtual {v6, v9, v0, v7, v8}, Landroid/view/View;->layout(IIII)V

    .line 477
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 490
    :cond_1
    iget v0, v0, Lrk;->topMargin:I

    add-int/2addr v0, v4

    goto :goto_1

    .line 496
    :cond_2
    return-void
.end method

.method protected onMeasure(II)V
    .locals 13

    .prologue
    const/4 v6, 0x1

    const/4 v3, 0x0

    .line 359
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 368
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    move-object v0, p0

    move v2, p1

    move v4, p2

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 369
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lrk;

    .line 370
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredWidth()I

    move-result v1

    iget v2, v0, Lrk;->leftMargin:I

    add-int/2addr v1, v2

    iget v2, v0, Lrk;->rightMargin:I

    add-int/2addr v1, v2

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 372
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredHeight()I

    move-result v1

    iget v2, v0, Lrk;->topMargin:I

    add-int/2addr v1, v2

    iget v0, v0, Lrk;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 374
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0}, Lgt;->j(Landroid/view/View;)I

    move-result v0

    invoke-static {v3, v0}, Ltm;->a(II)I

    move-result v7

    .line 378
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v0, :cond_6

    .line 379
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    move-object v0, p0

    move v2, p1

    move v4, p2

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 380
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lrk;

    .line 381
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredWidth()I

    move-result v1

    iget v2, v0, Lrk;->leftMargin:I

    add-int/2addr v1, v2

    iget v2, v0, Lrk;->rightMargin:I

    add-int/2addr v1, v2

    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 383
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredHeight()I

    move-result v2

    iget v4, v0, Lrk;->topMargin:I

    add-int/2addr v2, v4

    iget v0, v0, Lrk;->bottomMargin:I

    add-int/2addr v0, v2

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 385
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->h:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0}, Lgt;->j(Landroid/view/View;)I

    move-result v0

    invoke-static {v7, v0}, Ltm;->a(II)I

    move-result v0

    move v10, v0

    move v11, v1

    move v12, v2

    .line 389
    :goto_0
    invoke-static {p0}, Lgt;->p(Landroid/view/View;)I

    move-result v0

    .line 390
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_2

    move v1, v6

    .line 392
    :goto_1
    if-eqz v1, :cond_3

    .line 395
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->f:I

    .line 396
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->c:Z

    if-eqz v2, :cond_0

    .line 397
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 2225
    iget-object v2, v2, Landroid/support/v7/internal/widget/ActionBarContainer;->a:Landroid/view/View;

    .line 398
    if-eqz v2, :cond_0

    .line 400
    iget v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->f:I

    add-int/2addr v0, v2

    .line 424
    :cond_0
    :goto_2
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->r:Landroid/graphics/Rect;

    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->p:Landroid/graphics/Rect;

    invoke-virtual {v2, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 425
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->t:Landroid/graphics/Rect;

    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->s:Landroid/graphics/Rect;

    invoke-virtual {v2, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 426
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->b:Z

    if-nez v2, :cond_4

    if-nez v1, :cond_4

    .line 427
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->r:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v2

    iput v0, v1, Landroid/graphics/Rect;->top:I

    .line 428
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->r:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 433
    :goto_3
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->g:Landroid/support/v7/internal/widget/ContentFrameLayout;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->r:Landroid/graphics/Rect;

    move v7, v6

    move v8, v6

    move v9, v6

    invoke-static/range {v4 .. v9}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z

    .line 435
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->u:Landroid/graphics/Rect;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->t:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 439
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->u:Landroid/graphics/Rect;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->t:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 441
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->g:Landroid/support/v7/internal/widget/ContentFrameLayout;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->t:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ContentFrameLayout;->a(Landroid/graphics/Rect;)V

    .line 444
    :cond_1
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->g:Landroid/support/v7/internal/widget/ContentFrameLayout;

    move-object v0, p0

    move v2, p1

    move v4, p2

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 445
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->g:Landroid/support/v7/internal/widget/ContentFrameLayout;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ContentFrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lrk;

    .line 446
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->g:Landroid/support/v7/internal/widget/ContentFrameLayout;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ContentFrameLayout;->getMeasuredWidth()I

    move-result v1

    iget v2, v0, Lrk;->leftMargin:I

    add-int/2addr v1, v2

    iget v2, v0, Lrk;->rightMargin:I

    add-int/2addr v1, v2

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 448
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->g:Landroid/support/v7/internal/widget/ContentFrameLayout;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ContentFrameLayout;->getMeasuredHeight()I

    move-result v2

    iget v3, v0, Lrk;->topMargin:I

    add-int/2addr v2, v3

    iget v0, v0, Lrk;->bottomMargin:I

    add-int/2addr v0, v2

    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 450
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->g:Landroid/support/v7/internal/widget/ContentFrameLayout;

    invoke-static {v2}, Lgt;->j(Landroid/view/View;)I

    move-result v2

    invoke-static {v10, v2}, Ltm;->a(II)I

    move-result v2

    .line 454
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v1, v3

    .line 455
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getPaddingBottom()I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v0, v3

    .line 458
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getSuggestedMinimumHeight()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 459
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getSuggestedMinimumWidth()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 461
    invoke-static {v1, p1, v2}, Lgt;->a(III)I

    move-result v1

    shl-int/lit8 v2, v2, 0x10

    invoke-static {v0, p2, v2}, Lgt;->a(III)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->setMeasuredDimension(II)V

    .line 465
    return-void

    :cond_2
    move v1, v3

    .line 390
    goto/16 :goto_1

    .line 403
    :cond_3
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-eq v0, v2, :cond_5

    .line 406
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredHeight()I

    move-result v0

    goto/16 :goto_2

    .line 430
    :cond_4
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->t:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v2

    iput v0, v1, Landroid/graphics/Rect;->top:I

    .line 431
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->t:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    goto/16 :goto_3

    :cond_5
    move v0, v3

    goto/16 :goto_2

    :cond_6
    move v10, v7

    move v11, v8

    move v12, v9

    goto/16 :goto_0
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v1, 0x0

    .line 557
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->m:Z

    if-eqz v0, :cond_0

    if-nez p4, :cond_1

    .line 566
    :cond_0
    :goto_0
    return v1

    .line 3667
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->v:Llr;

    float-to-int v4, p3

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    move v2, v1

    move v3, v1

    move v5, v1

    move v6, v1

    invoke-virtual/range {v0 .. v8}, Llr;->a(IIIIIIII)V

    .line 3668
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->v:Llr;

    invoke-virtual {v0}, Llr;->d()I

    move-result v0

    .line 3669
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I

    move-result v2

    if-le v0, v2, :cond_2

    move v1, v9

    .line 560
    :cond_2
    if-eqz v1, :cond_3

    .line 4662
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j()V

    .line 4663
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->B:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 565
    :goto_1
    iput-boolean v9, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->n:Z

    move v1, v9

    .line 566
    goto :goto_0

    .line 5657
    :cond_3
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j()V

    .line 5658
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->A:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 1

    .prologue
    .line 576
    const/4 v0, 0x0

    return v0
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 0

    .prologue
    .line 572
    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 1

    .prologue
    .line 537
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->o:I

    add-int/2addr v0, p3

    iput v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->o:I

    .line 538
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->o:I

    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->b(I)V

    .line 539
    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 526
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->D:Lgl;

    .line 3058
    iput p3, v0, Lgl;->a:I

    .line 3619
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0}, Lgt;->l(Landroid/view/View;)F

    move-result v0

    float-to-int v0, v0

    neg-int v0, v0

    .line 527
    :goto_0
    iput v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->o:I

    .line 528
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j()V

    .line 529
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    if-eqz v0, :cond_0

    .line 530
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    invoke-interface {v0}, Lrj;->j()V

    .line 532
    :cond_0
    return-void

    .line 3619
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 518
    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    :cond_0
    const/4 v0, 0x0

    .line 521
    :goto_0
    return v0

    :cond_1
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->m:Z

    goto :goto_0
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x258

    .line 543
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->m:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->n:Z

    if-nez v0, :cond_0

    .line 544
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->o:I

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I

    move-result v1

    if-gt v0, v1, :cond_1

    .line 3647
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j()V

    .line 3648
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->A:Ljava/lang/Runnable;

    invoke-virtual {p0, v0, v2, v3}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 553
    :cond_0
    :goto_0
    return-void

    .line 3652
    :cond_1
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->j()V

    .line 3653
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->B:Ljava/lang/Runnable;

    invoke-virtual {p0, v0, v2, v3}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public onWindowSystemUiVisibilityChanged(I)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 250
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v0, v3, :cond_0

    .line 251
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowSystemUiVisibilityChanged(I)V

    .line 253
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->i()V

    .line 254
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->d:I

    xor-int v4, v0, p1

    .line 255
    iput p1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->d:I

    .line 256
    and-int/lit8 v0, p1, 0x4

    if-nez v0, :cond_4

    move v3, v1

    .line 257
    :goto_0
    and-int/lit16 v0, p1, 0x100

    if-eqz v0, :cond_5

    move v0, v1

    .line 258
    :goto_1
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    if-eqz v5, :cond_2

    .line 262
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    if-nez v0, :cond_6

    :goto_2
    invoke-interface {v5, v1}, Lrj;->f(Z)V

    .line 263
    if-nez v3, :cond_1

    if-nez v0, :cond_7

    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    invoke-interface {v0}, Lrj;->h()V

    .line 266
    :cond_2
    :goto_3
    and-int/lit16 v0, v4, 0x100

    if-eqz v0, :cond_3

    .line 267
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    if-eqz v0, :cond_3

    .line 268
    invoke-static {p0}, Lgt;->q(Landroid/view/View;)V

    .line 271
    :cond_3
    return-void

    :cond_4
    move v3, v2

    .line 256
    goto :goto_0

    :cond_5
    move v0, v2

    .line 257
    goto :goto_1

    :cond_6
    move v1, v2

    .line 262
    goto :goto_2

    .line 264
    :cond_7
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    invoke-interface {v0}, Lrj;->i()V

    goto :goto_3
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 1

    .prologue
    .line 275
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowVisibilityChanged(I)V

    .line 276
    iput p1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a:I

    .line 277
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    if-eqz v0, :cond_0

    .line 278
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    invoke-interface {v0, p1}, Lrj;->c(I)V

    .line 280
    :cond_0
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    .prologue
    .line 513
    const/4 v0, 0x0

    return v0
.end method
