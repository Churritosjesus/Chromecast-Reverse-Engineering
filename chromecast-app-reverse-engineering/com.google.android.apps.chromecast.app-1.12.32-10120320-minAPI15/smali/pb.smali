.class public Lpb;
.super Lmj;
.source "PG"

# interfaces
.implements Lrj;


# static fields
.field private static final e:Z


# instance fields
.field private A:Liu;

.field private B:Liu;

.field private C:Liw;

.field a:Lpf;

.field b:Lvr;

.field c:Lvs;

.field d:Z

.field private f:Landroid/content/Context;

.field private g:Landroid/content/Context;

.field private h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

.field private i:Landroid/support/v7/internal/widget/ActionBarContainer;

.field private j:Lse;

.field private k:Landroid/support/v7/internal/widget/ActionBarContextView;

.field private l:Landroid/support/v7/internal/widget/ActionBarContainer;

.field private m:Landroid/view/View;

.field private n:Z

.field private o:Z

.field private p:Ljava/util/ArrayList;

.field private q:I

.field private r:Z

.field private s:I

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Lpp;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 82
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lpb;->e:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 172
    invoke-direct {p0}, Lmj;-><init>()V

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpb;->p:Ljava/util/ArrayList;

    .line 120
    const/4 v0, 0x0

    iput v0, p0, Lpb;->s:I

    .line 122
    iput-boolean v1, p0, Lpb;->t:Z

    .line 127
    iput-boolean v1, p0, Lpb;->x:Z

    .line 135
    new-instance v0, Lpc;

    invoke-direct {v0, p0}, Lpc;-><init>(Lpb;)V

    iput-object v0, p0, Lpb;->A:Liu;

    .line 155
    new-instance v0, Lpd;

    invoke-direct {v0, p0}, Lpd;-><init>(Lpb;)V

    iput-object v0, p0, Lpb;->B:Liu;

    .line 163
    new-instance v0, Lpe;

    invoke-direct {v0, p0}, Lpe;-><init>(Lpb;)V

    iput-object v0, p0, Lpb;->C:Liw;

    .line 174
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 175
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 176
    invoke-direct {p0, v0}, Lpb;->a(Landroid/view/View;)V

    .line 177
    if-nez p2, :cond_0

    .line 178
    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lpb;->m:Landroid/view/View;

    .line 180
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 182
    invoke-direct {p0}, Lmj;-><init>()V

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpb;->p:Ljava/util/ArrayList;

    .line 120
    const/4 v0, 0x0

    iput v0, p0, Lpb;->s:I

    .line 122
    iput-boolean v1, p0, Lpb;->t:Z

    .line 127
    iput-boolean v1, p0, Lpb;->x:Z

    .line 135
    new-instance v0, Lpc;

    invoke-direct {v0, p0}, Lpc;-><init>(Lpb;)V

    iput-object v0, p0, Lpb;->A:Liu;

    .line 155
    new-instance v0, Lpd;

    invoke-direct {v0, p0}, Lpd;-><init>(Lpb;)V

    iput-object v0, p0, Lpb;->B:Liu;

    .line 163
    new-instance v0, Lpe;

    invoke-direct {v0, p0}, Lpe;-><init>(Lpb;)V

    iput-object v0, p0, Lpb;->C:Liw;

    .line 184
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lpb;->a(Landroid/view/View;)V

    .line 185
    return-void
.end method

.method static synthetic a(Lpb;Lpp;)Lpp;
    .locals 1

    .prologue
    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lpb;->y:Lpp;

    return-object v0
.end method

.method private a(II)V
    .locals 4

    .prologue
    .line 461
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0}, Lse;->m()I

    move-result v0

    .line 462
    and-int/lit8 v1, p2, 0x4

    if-eqz v1, :cond_0

    .line 463
    const/4 v1, 0x1

    iput-boolean v1, p0, Lpb;->n:Z

    .line 465
    :cond_0
    iget-object v1, p0, Lpb;->j:Lse;

    and-int v2, p1, p2

    xor-int/lit8 v3, p2, -0x1

    and-int/2addr v0, v3

    or-int/2addr v0, v2

    invoke-interface {v1, v0}, Lse;->a(I)V

    .line 466
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 197
    sget v0, La;->bd:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    iput-object v0, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    .line 198
    iget-object v0, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_0

    .line 199
    iget-object v0, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    .line 2187
    iput-object p0, v0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    .line 2188
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 2191
    iget-object v3, v0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->e:Lrj;

    iget v4, v0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a:I

    invoke-interface {v3, v4}, Lrj;->c(I)V

    .line 2192
    iget v3, v0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->d:I

    if-eqz v3, :cond_0

    .line 2193
    iget v3, v0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->d:I

    .line 2194
    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->onWindowSystemUiVisibilityChanged(I)V

    .line 2195
    invoke-static {v0}, Lgt;->q(Landroid/view/View;)V

    .line 201
    :cond_0
    sget v0, La;->aP:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 2243
    instance-of v3, v0, Lse;

    if-eqz v3, :cond_2

    .line 2244
    check-cast v0, Lse;

    .line 201
    :goto_0
    iput-object v0, p0, Lpb;->j:Lse;

    .line 202
    sget v0, La;->aU:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContextView;

    iput-object v0, p0, Lpb;->k:Landroid/support/v7/internal/widget/ActionBarContextView;

    .line 204
    sget v0, La;->aR:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 207
    sget v0, La;->bu:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 209
    iget-object v0, p0, Lpb;->j:Lse;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpb;->k:Landroid/support/v7/internal/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-nez v0, :cond_5

    .line 210
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " can only be used with a compatible window decor layout"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2245
    :cond_2
    instance-of v3, v0, Landroid/support/v7/widget/Toolbar;

    if-eqz v3, :cond_3

    .line 2246
    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->h()Lse;

    move-result-object v0

    goto :goto_0

    .line 2248
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Can\'t make a decor toolbar out of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    const-string v0, "null"

    goto :goto_1

    .line 214
    :cond_5
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0}, Lse;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lpb;->f:Landroid/content/Context;

    .line 215
    iput v2, p0, Lpb;->q:I

    .line 219
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0}, Lse;->m()I

    move-result v0

    .line 220
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_8

    move v0, v1

    .line 221
    :goto_2
    if-eqz v0, :cond_6

    .line 222
    iput-boolean v1, p0, Lpb;->n:Z

    .line 225
    :cond_6
    iget-object v0, p0, Lpb;->f:Landroid/content/Context;

    invoke-static {v0}, Lph;->a(Landroid/content/Context;)Lph;

    move-result-object v0

    .line 3089
    iget-object v3, v0, Lph;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v4, 0xe

    if-ge v3, v4, :cond_7

    .line 227
    :cond_7
    invoke-virtual {v0}, Lph;->a()Z

    move-result v0

    invoke-direct {p0, v0}, Lpb;->h(Z)V

    .line 229
    iget-object v0, p0, Lpb;->f:Landroid/content/Context;

    const/4 v3, 0x0

    sget-object v4, Loq;->a:[I

    sget v5, La;->i:I

    invoke-virtual {v0, v3, v4, v5, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 232
    sget v3, Loq;->k:I

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 3715
    iget-object v3, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    .line 4213
    iget-boolean v3, v3, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->b:Z

    .line 3715
    if-nez v3, :cond_9

    .line 3716
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move v0, v2

    .line 220
    goto :goto_2

    .line 3719
    :cond_9
    iput-boolean v1, p0, Lpb;->d:Z

    .line 3720
    iget-object v3, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a(Z)V

    .line 235
    :cond_a
    sget v1, Loq;->i:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    .line 236
    if-eqz v1, :cond_b

    .line 237
    int-to-float v1, v1

    .line 4255
    iget-object v2, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v2, v1}, Lgt;->f(Landroid/view/View;F)V

    .line 4256
    iget-object v2, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v2, :cond_b

    .line 4257
    iget-object v2, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v2, v1}, Lgt;->f(Landroid/view/View;F)V

    .line 239
    :cond_b
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 240
    return-void
.end method

.method static synthetic a(Lpb;)Z
    .locals 1

    .prologue
    .line 75
    iget-boolean v0, p0, Lpb;->t:Z

    return v0
.end method

.method static synthetic a(ZZZ)Z
    .locals 1

    .prologue
    .line 75
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lpb;->b(ZZZ)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lpb;)Landroid/view/View;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lpb;->m:Landroid/view/View;

    return-object v0
.end method

.method private static b(ZZZ)Z
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 744
    if-eqz p2, :cond_1

    .line 749
    :cond_0
    :goto_0
    return v0

    .line 746
    :cond_1
    if-nez p0, :cond_2

    if-eqz p1, :cond_0

    .line 747
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lpb;)Landroid/support/v7/internal/widget/ActionBarContainer;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    return-object v0
.end method

.method static synthetic d(Lpb;)Landroid/support/v7/internal/widget/ActionBarContainer;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    return-object v0
.end method

.method static synthetic e(Lpb;)I
    .locals 1

    .prologue
    .line 75
    iget v0, p0, Lpb;->q:I

    return v0
.end method

.method static synthetic f(Lpb;)Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    return-object v0
.end method

.method static synthetic g(Lpb;)Z
    .locals 1

    .prologue
    .line 75
    iget-boolean v0, p0, Lpb;->u:Z

    return v0
.end method

.method private h(Z)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 271
    iput-boolean p1, p0, Lpb;->r:Z

    .line 273
    iget-boolean v0, p0, Lpb;->r:Z

    if-nez v0, :cond_0

    .line 274
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0, v3}, Lse;->a(Lsm;)V

    .line 275
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->a(Lsm;)V

    .line 4495
    :goto_0
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0}, Lse;->n()I

    move-result v0

    .line 280
    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    move v0, v1

    .line 291
    :goto_1
    iget-object v4, p0, Lpb;->j:Lse;

    iget-boolean v3, p0, Lpb;->r:Z

    if-nez v3, :cond_2

    if-eqz v0, :cond_2

    move v3, v1

    :goto_2
    invoke-interface {v4, v3}, Lse;->a(Z)V

    .line 292
    iget-object v3, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    iget-boolean v4, p0, Lpb;->r:Z

    if-nez v4, :cond_3

    if-eqz v0, :cond_3

    .line 5217
    :goto_3
    iput-boolean v1, v3, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->c:Z

    .line 293
    return-void

    .line 277
    :cond_0
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->a(Lsm;)V

    .line 278
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0, v3}, Lse;->a(Lsm;)V

    goto :goto_0

    :cond_1
    move v0, v2

    .line 280
    goto :goto_1

    :cond_2
    move v3, v2

    .line 291
    goto :goto_2

    :cond_3
    move v1, v2

    .line 292
    goto :goto_3
.end method

.method static synthetic h(Lpb;)Z
    .locals 1

    .prologue
    .line 75
    iget-boolean v0, p0, Lpb;->v:Z

    return v0
.end method

.method static synthetic i(Lpb;)Landroid/support/v7/internal/widget/ActionBarContextView;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lpb;->k:Landroid/support/v7/internal/widget/ActionBarContextView;

    return-object v0
.end method

.method private i(Z)V
    .locals 8

    .prologue
    const/4 v3, 0x2

    const/4 v7, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 755
    iget-boolean v0, p0, Lpb;->u:Z

    iget-boolean v1, p0, Lpb;->v:Z

    iget-boolean v2, p0, Lpb;->w:Z

    invoke-static {v0, v1, v2}, Lpb;->b(ZZZ)Z

    move-result v0

    .line 758
    if-eqz v0, :cond_9

    .line 759
    iget-boolean v0, p0, Lpb;->x:Z

    if-nez v0, :cond_5

    .line 760
    iput-boolean v5, p0, Lpb;->x:Z

    .line 5772
    iget-object v0, p0, Lpb;->y:Lpp;

    if-eqz v0, :cond_0

    .line 5773
    iget-object v0, p0, Lpb;->y:Lpp;

    invoke-virtual {v0}, Lpp;->b()V

    .line 5775
    :cond_0
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, v7}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 5777
    iget v0, p0, Lpb;->s:I

    if-nez v0, :cond_6

    sget-boolean v0, Lpb;->e:Z

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lpb;->z:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_6

    .line 5780
    :cond_1
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0, v4}, Lgt;->b(Landroid/view/View;F)V

    .line 5781
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    .line 5782
    if-eqz p1, :cond_2

    .line 5783
    new-array v1, v3, [I

    fill-array-data v1, :array_0

    .line 5784
    iget-object v2, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->getLocationInWindow([I)V

    .line 5785
    aget v1, v1, v5

    int-to-float v1, v1

    sub-float/2addr v0, v1

    .line 5787
    :cond_2
    iget-object v1, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v1, v0}, Lgt;->b(Landroid/view/View;F)V

    .line 5788
    new-instance v1, Lpp;

    invoke-direct {v1}, Lpp;-><init>()V

    .line 5789
    iget-object v2, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v2}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v2

    invoke-virtual {v2, v4}, Lih;->c(F)Lih;

    move-result-object v2

    .line 5790
    iget-object v3, p0, Lpb;->C:Liw;

    invoke-virtual {v2, v3}, Lih;->a(Liw;)Lih;

    .line 5791
    invoke-virtual {v1, v2}, Lpp;->a(Lih;)Lpp;

    .line 5792
    iget-boolean v2, p0, Lpb;->t:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lpb;->m:Landroid/view/View;

    if-eqz v2, :cond_3

    .line 5793
    iget-object v2, p0, Lpb;->m:Landroid/view/View;

    invoke-static {v2, v0}, Lgt;->b(Landroid/view/View;F)V

    .line 5794
    iget-object v0, p0, Lpb;->m:Landroid/view/View;

    invoke-static {v0}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v0

    invoke-virtual {v0, v4}, Lih;->c(F)Lih;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpp;->a(Lih;)Lpp;

    .line 5796
    :cond_3
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v0, :cond_4

    iget v0, p0, Lpb;->q:I

    if-ne v0, v5, :cond_4

    .line 5797
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    iget-object v2, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0, v2}, Lgt;->b(Landroid/view/View;F)V

    .line 5798
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, v7}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 5799
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v0

    invoke-virtual {v0, v4}, Lih;->c(F)Lih;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpp;->a(Lih;)Lpp;

    .line 5801
    :cond_4
    iget-object v0, p0, Lpb;->f:Landroid/content/Context;

    const v2, 0x10a0006

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpp;->a(Landroid/view/animation/Interpolator;)Lpp;

    .line 5803
    const-wide/16 v2, 0xfa

    invoke-virtual {v1, v2, v3}, Lpp;->a(J)Lpp;

    .line 5811
    iget-object v0, p0, Lpb;->B:Liu;

    invoke-virtual {v1, v0}, Lpp;->a(Liu;)Lpp;

    .line 5812
    iput-object v1, p0, Lpb;->y:Lpp;

    .line 5813
    invoke-virtual {v1}, Lpp;->a()V

    .line 5827
    :goto_0
    iget-object v0, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_5

    .line 5828
    iget-object v0, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    invoke-static {v0}, Lgt;->q(Landroid/view/View;)V

    .line 5864
    :cond_5
    :goto_1
    return-void

    .line 5815
    :cond_6
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0, v6}, Lgt;->c(Landroid/view/View;F)V

    .line 5816
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0, v4}, Lgt;->b(Landroid/view/View;F)V

    .line 5817
    iget-boolean v0, p0, Lpb;->t:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lpb;->m:Landroid/view/View;

    if-eqz v0, :cond_7

    .line 5818
    iget-object v0, p0, Lpb;->m:Landroid/view/View;

    invoke-static {v0, v4}, Lgt;->b(Landroid/view/View;F)V

    .line 5820
    :cond_7
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v0, :cond_8

    iget v0, p0, Lpb;->q:I

    if-ne v0, v5, :cond_8

    .line 5821
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0, v6}, Lgt;->c(Landroid/view/View;F)V

    .line 5822
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0, v4}, Lgt;->b(Landroid/view/View;F)V

    .line 5823
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, v7}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 5825
    :cond_8
    iget-object v0, p0, Lpb;->B:Liu;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Liu;->b(Landroid/view/View;)V

    goto :goto_0

    .line 764
    :cond_9
    iget-boolean v0, p0, Lpb;->x:Z

    if-eqz v0, :cond_5

    .line 765
    iput-boolean v7, p0, Lpb;->x:Z

    .line 5833
    iget-object v0, p0, Lpb;->y:Lpp;

    if-eqz v0, :cond_a

    .line 5834
    iget-object v0, p0, Lpb;->y:Lpp;

    invoke-virtual {v0}, Lpp;->b()V

    .line 5837
    :cond_a
    iget v0, p0, Lpb;->s:I

    if-nez v0, :cond_f

    sget-boolean v0, Lpb;->e:Z

    if-eqz v0, :cond_f

    iget-boolean v0, p0, Lpb;->z:Z

    if-nez v0, :cond_b

    if-eqz p1, :cond_f

    .line 5839
    :cond_b
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0, v6}, Lgt;->c(Landroid/view/View;F)V

    .line 5840
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, v5}, Landroid/support/v7/internal/widget/ActionBarContainer;->a(Z)V

    .line 5841
    new-instance v1, Lpp;

    invoke-direct {v1}, Lpp;-><init>()V

    .line 5842
    iget-object v0, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    .line 5843
    if-eqz p1, :cond_c

    .line 5844
    new-array v2, v3, [I

    fill-array-data v2, :array_1

    .line 5845
    iget-object v3, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v3, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->getLocationInWindow([I)V

    .line 5846
    aget v2, v2, v5

    int-to-float v2, v2

    sub-float/2addr v0, v2

    .line 5848
    :cond_c
    iget-object v2, p0, Lpb;->i:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v2}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v2

    invoke-virtual {v2, v0}, Lih;->c(F)Lih;

    move-result-object v2

    .line 5849
    iget-object v3, p0, Lpb;->C:Liw;

    invoke-virtual {v2, v3}, Lih;->a(Liw;)Lih;

    .line 5850
    invoke-virtual {v1, v2}, Lpp;->a(Lih;)Lpp;

    .line 5851
    iget-boolean v2, p0, Lpb;->t:Z

    if-eqz v2, :cond_d

    iget-object v2, p0, Lpb;->m:Landroid/view/View;

    if-eqz v2, :cond_d

    .line 5852
    iget-object v2, p0, Lpb;->m:Landroid/view/View;

    invoke-static {v2}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v2

    invoke-virtual {v2, v0}, Lih;->c(F)Lih;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpp;->a(Lih;)Lpp;

    .line 5854
    :cond_d
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v0

    if-nez v0, :cond_e

    .line 5855
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0, v6}, Lgt;->c(Landroid/view/View;F)V

    .line 5856
    iget-object v0, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-static {v0}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v0

    iget-object v2, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lih;->c(F)Lih;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpp;->a(Lih;)Lpp;

    .line 5858
    :cond_e
    iget-object v0, p0, Lpb;->f:Landroid/content/Context;

    const v2, 0x10a0005

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpp;->a(Landroid/view/animation/Interpolator;)Lpp;

    .line 5860
    const-wide/16 v2, 0xfa

    invoke-virtual {v1, v2, v3}, Lpp;->a(J)Lpp;

    .line 5861
    iget-object v0, p0, Lpb;->A:Liu;

    invoke-virtual {v1, v0}, Lpp;->a(Liu;)Lpp;

    .line 5862
    iput-object v1, p0, Lpb;->y:Lpp;

    .line 5863
    invoke-virtual {v1}, Lpp;->a()V

    goto/16 :goto_1

    .line 5865
    :cond_f
    iget-object v0, p0, Lpb;->A:Liu;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Liu;->b(Landroid/view/View;)V

    goto/16 :goto_1

    .line 5783
    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 5844
    :array_1
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method static synthetic j(Lpb;)Lse;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lpb;->j:Lse;

    return-object v0
.end method

.method static synthetic k(Lpb;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lpb;->f:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 487
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0}, Lse;->e()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lvs;)Lvr;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 503
    iget-object v0, p0, Lpb;->a:Lpf;

    if-eqz v0, :cond_0

    .line 504
    iget-object v0, p0, Lpb;->a:Lpf;

    invoke-virtual {v0}, Lpf;->c()V

    .line 507
    :cond_0
    iget-object v0, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a(Z)V

    .line 508
    iget-object v0, p0, Lpb;->k:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->c()V

    .line 509
    new-instance v0, Lpf;

    iget-object v1, p0, Lpb;->k:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lpf;-><init>(Lpb;Landroid/content/Context;Lvs;)V

    .line 510
    invoke-virtual {v0}, Lpf;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 511
    invoke-virtual {v0}, Lpf;->d()V

    .line 512
    iget-object v1, p0, Lpb;->k:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->a(Lvr;)V

    .line 513
    invoke-virtual {p0, v3}, Lpb;->g(Z)V

    .line 514
    iget-object v1, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v1, :cond_1

    iget v1, p0, Lpb;->q:I

    if-ne v1, v3, :cond_1

    .line 516
    iget-object v1, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_1

    .line 517
    iget-object v1, p0, Lpb;->l:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 518
    iget-object v1, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_1

    .line 519
    iget-object v1, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    invoke-static {v1}, Lgt;->q(Landroid/view/View;)V

    .line 523
    :cond_1
    iget-object v1, p0, Lpb;->k:Landroid/support/v7/internal/widget/ActionBarContextView;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->sendAccessibilityEvent(I)V

    .line 524
    iput-object v0, p0, Lpb;->a:Lpf;

    .line 527
    :goto_0
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 403
    iget-object v0, p0, Lpb;->f:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpb;->a(Ljava/lang/CharSequence;)V

    .line 404
    return-void
.end method

.method public final a(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lpb;->f:Landroid/content/Context;

    invoke-static {v0}, Lph;->a(Landroid/content/Context;)Lph;

    move-result-object v0

    invoke-virtual {v0}, Lph;->a()Z

    move-result v0

    invoke-direct {p0, v0}, Lpb;->h(Z)V

    .line 268
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 910
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0, p1}, Lse;->a(Landroid/graphics/drawable/Drawable;)V

    .line 911
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 441
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0, p1}, Lse;->b(Ljava/lang/CharSequence;)V

    .line 442
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    const/4 v0, 0x2

    .line 378
    invoke-direct {p0, v0, v0}, Lpb;->a(II)V

    .line 379
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 499
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0}, Lse;->m()I

    move-result v0

    return v0
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 925
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0, p1}, Lse;->c(I)V

    .line 926
    return-void
.end method

.method public final b(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 450
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0, p1}, Lse;->c(Ljava/lang/CharSequence;)V

    .line 451
    return-void
.end method

.method public final b(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 383
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-direct {p0, v0, v1}, Lpb;->a(II)V

    .line 384
    return-void

    .line 383
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 665
    iget-boolean v0, p0, Lpb;->u:Z

    if-eqz v0, :cond_0

    .line 666
    iput-boolean v1, p0, Lpb;->u:Z

    .line 667
    invoke-direct {p0, v1}, Lpb;->i(Z)V

    .line 669
    :cond_0
    return-void
.end method

.method public final c(I)V
    .locals 0

    .prologue
    .line 328
    iput p1, p0, Lpb;->s:I

    .line 329
    return-void
.end method

.method public final c(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 446
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0, p1}, Lse;->a(Ljava/lang/CharSequence;)V

    .line 447
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .prologue
    .line 1357
    iget-boolean v0, p0, Lpb;->n:Z

    if-nez v0, :cond_0

    .line 1358
    invoke-virtual {p0, p1}, Lpb;->b(Z)V

    .line 1360
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 690
    iget-boolean v0, p0, Lpb;->u:Z

    if-nez v0, :cond_0

    .line 691
    const/4 v0, 0x1

    iput-boolean v0, p0, Lpb;->u:Z

    .line 692
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lpb;->i(Z)V

    .line 694
    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 1

    .prologue
    .line 339
    iput-boolean p1, p0, Lpb;->z:Z

    .line 340
    if-nez p1, :cond_0

    iget-object v0, p0, Lpb;->y:Lpp;

    if-eqz v0, :cond_0

    .line 341
    iget-object v0, p0, Lpb;->y:Lpp;

    invoke-virtual {v0}, Lpp;->b()V

    .line 343
    :cond_0
    return-void
.end method

.method public final e()Landroid/content/Context;
    .locals 4

    .prologue
    .line 888
    iget-object v0, p0, Lpb;->g:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 889
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 890
    iget-object v1, p0, Lpb;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    .line 891
    sget v2, La;->m:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 892
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    .line 894
    if-eqz v0, :cond_1

    .line 895
    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget-object v2, p0, Lpb;->f:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lpb;->g:Landroid/content/Context;

    .line 900
    :cond_0
    :goto_0
    iget-object v0, p0, Lpb;->g:Landroid/content/Context;

    return-object v0

    .line 897
    :cond_1
    iget-object v0, p0, Lpb;->f:Landroid/content/Context;

    iput-object v0, p0, Lpb;->g:Landroid/content/Context;

    goto :goto_0
.end method

.method public final e(Z)V
    .locals 3

    .prologue
    .line 354
    iget-boolean v0, p0, Lpb;->o:Z

    if-ne p1, v0, :cond_1

    .line 363
    :cond_0
    return-void

    .line 357
    :cond_1
    iput-boolean p1, p0, Lpb;->o:Z

    .line 359
    iget-object v0, p0, Lpb;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 360
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 361
    iget-object v2, p0, Lpb;->p:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 360
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final f(Z)V
    .locals 0

    .prologue
    .line 660
    iput-boolean p1, p0, Lpb;->t:Z

    .line 661
    return-void
.end method

.method public final g(Z)V
    .locals 4

    .prologue
    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 876
    if-eqz p1, :cond_2

    .line 6672
    iget-boolean v0, p0, Lpb;->w:Z

    if-nez v0, :cond_1

    .line 6673
    const/4 v0, 0x1

    iput-boolean v0, p0, Lpb;->w:Z

    .line 6674
    iget-object v0, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_0

    .line 6675
    invoke-static {}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a()V

    .line 6677
    :cond_0
    invoke-direct {p0, v2}, Lpb;->i(Z)V

    .line 882
    :cond_1
    :goto_0
    iget-object v3, p0, Lpb;->j:Lse;

    if-eqz p1, :cond_4

    move v0, v1

    :goto_1
    invoke-interface {v3, v0}, Lse;->b(I)V

    .line 883
    iget-object v0, p0, Lpb;->k:Landroid/support/v7/internal/widget/ActionBarContextView;

    if-eqz p1, :cond_5

    :goto_2
    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->b(I)V

    .line 885
    return-void

    .line 6697
    :cond_2
    iget-boolean v0, p0, Lpb;->w:Z

    if-eqz v0, :cond_1

    .line 6698
    iput-boolean v2, p0, Lpb;->w:Z

    .line 6699
    iget-object v0, p0, Lpb;->h:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_3

    .line 6700
    invoke-static {}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a()V

    .line 6702
    :cond_3
    invoke-direct {p0, v2}, Lpb;->i(Z)V

    goto :goto_0

    :cond_4
    move v0, v2

    .line 882
    goto :goto_1

    :cond_5
    move v2, v1

    .line 883
    goto :goto_2
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 942
    iget-object v0, p0, Lpb;->j:Lse;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0}, Lse;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 943
    iget-object v0, p0, Lpb;->j:Lse;

    invoke-interface {v0}, Lse;->d()V

    .line 944
    const/4 v0, 0x1

    .line 946
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 682
    iget-boolean v0, p0, Lpb;->v:Z

    if-eqz v0, :cond_0

    .line 683
    const/4 v0, 0x0

    iput-boolean v0, p0, Lpb;->v:Z

    .line 684
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lpb;->i(Z)V

    .line 686
    :cond_0
    return-void
.end method

.method public final i()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 707
    iget-boolean v0, p0, Lpb;->v:Z

    if-nez v0, :cond_0

    .line 708
    iput-boolean v1, p0, Lpb;->v:Z

    .line 709
    invoke-direct {p0, v1}, Lpb;->i(Z)V

    .line 711
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 930
    iget-object v0, p0, Lpb;->y:Lpp;

    if-eqz v0, :cond_0

    .line 931
    iget-object v0, p0, Lpb;->y:Lpp;

    invoke-virtual {v0}, Lpp;->b()V

    .line 932
    const/4 v0, 0x0

    iput-object v0, p0, Lpb;->y:Lpp;

    .line 934
    :cond_0
    return-void
.end method
