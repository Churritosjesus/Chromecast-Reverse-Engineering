.class Lno;
.super Lni;
.source "PG"

# interfaces
.implements Lfs;
.implements Lqb;


# instance fields
.field private A:Landroid/view/View;

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:[Lnw;

.field private F:Lnw;

.field private final G:Ljava/lang/Runnable;

.field private H:Z

.field private I:Landroid/graphics/Rect;

.field private J:Landroid/graphics/Rect;

.field private K:Lot;

.field private n:Lsd;

.field o:Lvr;

.field p:Landroid/support/v7/internal/widget/ActionBarContextView;

.field q:Landroid/widget/PopupWindow;

.field r:Ljava/lang/Runnable;

.field s:Landroid/view/ViewGroup;

.field t:Z

.field u:I

.field private v:Lnt;

.field private w:Lnx;

.field private x:Z

.field private y:Landroid/view/ViewGroup;

.field private z:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/view/Window;Lng;)V
    .locals 1

    .prologue
    .line 141
    invoke-direct {p0, p1, p2, p3}, Lni;-><init>(Landroid/content/Context;Landroid/view/Window;Lng;)V

    .line 119
    new-instance v0, Lnp;

    invoke-direct {v0, p0}, Lnp;-><init>(Lno;)V

    iput-object v0, p0, Lno;->G:Ljava/lang/Runnable;

    .line 142
    return-void
.end method

.method static synthetic a(Lno;I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 89
    .line 22378
    invoke-virtual {p0, p1}, Lno;->e(I)Lnw;

    move-result-object v0

    .line 22380
    iget-object v1, v0, Lnw;->h:Lqa;

    if-eqz v1, :cond_1

    .line 22381
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 22382
    iget-object v2, v0, Lnw;->h:Lqa;

    invoke-virtual {v2, v1}, Lqa;->a(Landroid/os/Bundle;)V

    .line 22383
    invoke-virtual {v1}, Landroid/os/Bundle;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 22384
    iput-object v1, v0, Lnw;->q:Landroid/os/Bundle;

    .line 22387
    :cond_0
    iget-object v1, v0, Lnw;->h:Lqa;

    invoke-virtual {v1}, Lqa;->d()V

    .line 22388
    iget-object v1, v0, Lnw;->h:Lqa;

    invoke-virtual {v1}, Lqa;->clear()V

    .line 22390
    :cond_1
    iput-boolean v4, v0, Lnw;->p:Z

    .line 22391
    iput-boolean v4, v0, Lnw;->o:Z

    .line 22394
    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object v0, p0, Lno;->n:Lsd;

    if-eqz v0, :cond_3

    .line 22396
    invoke-virtual {p0, v3}, Lno;->e(I)Lnw;

    move-result-object v0

    .line 22397
    if-eqz v0, :cond_3

    .line 22398
    iput-boolean v3, v0, Lnw;->k:Z

    .line 22399
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lno;->b(Lnw;Landroid/view/KeyEvent;)Z

    .line 89
    :cond_3
    return-void
.end method

.method private a(Lnw;Landroid/view/KeyEvent;)V
    .locals 10

    .prologue
    const/4 v1, -0x1

    const/4 v2, -0x2

    const/4 v3, 0x0

    const/4 v9, 0x1

    .line 853
    iget-boolean v0, p1, Lnw;->m:Z

    if-nez v0, :cond_0

    .line 14229
    iget-boolean v0, p0, Lni;->m:Z

    .line 853
    if-eqz v0, :cond_1

    .line 949
    :cond_0
    :goto_0
    return-void

    .line 859
    :cond_1
    iget v0, p1, Lnw;->a:I

    if-nez v0, :cond_2

    .line 860
    iget-object v4, p0, Lno;->a:Landroid/content/Context;

    .line 861
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 862
    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    const/4 v5, 0x4

    if-ne v0, v5, :cond_3

    move v0, v9

    .line 864
    :goto_1
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v5, 0xb

    if-lt v4, v5, :cond_4

    move v4, v9

    .line 867
    :goto_2
    if-eqz v0, :cond_2

    if-nez v4, :cond_0

    .line 14233
    :cond_2
    iget-object v0, p0, Lni;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    .line 873
    if-eqz v0, :cond_5

    iget v4, p1, Lnw;->a:I

    iget-object v5, p1, Lnw;->h:Lqa;

    invoke-interface {v0, v4, v5}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 875
    invoke-virtual {p0, p1, v9}, Lno;->a(Lnw;Z)V

    goto :goto_0

    :cond_3
    move v0, v3

    .line 862
    goto :goto_1

    :cond_4
    move v4, v3

    .line 864
    goto :goto_2

    .line 879
    :cond_5
    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    const-string v4, "window"

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/view/WindowManager;

    .line 880
    if-eqz v8, :cond_0

    .line 885
    invoke-direct {p0, p1, p2}, Lno;->b(Lnw;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 890
    iget-object v0, p1, Lnw;->e:Landroid/view/ViewGroup;

    if-eqz v0, :cond_6

    iget-boolean v0, p1, Lnw;->o:Z

    if-eqz v0, :cond_15

    .line 891
    :cond_6
    iget-object v0, p1, Lnw;->e:Landroid/view/ViewGroup;

    if-nez v0, :cond_d

    .line 14952
    invoke-virtual {p0}, Lno;->k()Landroid/content/Context;

    move-result-object v0

    .line 15669
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 15670
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 15671
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 15674
    sget v5, La;->g:I

    invoke-virtual {v4, v5, v1, v9}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 15675
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_7

    .line 15676
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v5, v9}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 15680
    :cond_7
    sget v5, La;->K:I

    invoke-virtual {v4, v5, v1, v9}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 15681
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_c

    .line 15682
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v1, v9}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 15687
    :goto_3
    new-instance v1, Lpi;

    invoke-direct {v1, v0, v3}, Lpi;-><init>(Landroid/content/Context;I)V

    .line 15688
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 15690
    iput-object v1, p1, Lnw;->j:Landroid/content/Context;

    .line 15692
    sget-object v0, Loq;->bN:[I

    invoke-virtual {v1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 15693
    sget v1, Loq;->bQ:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p1, Lnw;->b:I

    .line 15695
    sget v1, Loq;->bO:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p1, Lnw;->d:I

    .line 15697
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 14953
    new-instance v0, Lnv;

    iget-object v1, p1, Lnw;->j:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lnv;-><init>(Lno;Landroid/content/Context;)V

    iput-object v0, p1, Lnw;->e:Landroid/view/ViewGroup;

    .line 14954
    const/16 v0, 0x51

    iput v0, p1, Lnw;->c:I

    .line 893
    iget-object v0, p1, Lnw;->e:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 16046
    :cond_8
    :goto_4
    iget-object v0, p1, Lnw;->g:Landroid/view/View;

    if-eqz v0, :cond_e

    .line 16047
    iget-object v0, p1, Lnw;->g:Landroid/view/View;

    iput-object v0, p1, Lnw;->f:Landroid/view/View;

    move v0, v9

    .line 901
    :goto_5
    if-eqz v0, :cond_0

    .line 17652
    iget-object v0, p1, Lnw;->f:Landroid/view/View;

    if-eqz v0, :cond_14

    .line 17653
    iget-object v0, p1, Lnw;->g:Landroid/view/View;

    if-eqz v0, :cond_13

    move v0, v9

    .line 901
    :goto_6
    if-eqz v0, :cond_0

    .line 905
    iget-object v0, p1, Lnw;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 906
    if-nez v0, :cond_17

    .line 907
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    move-object v1, v0

    .line 910
    :goto_7
    iget v0, p1, Lnw;->b:I

    .line 911
    iget-object v4, p1, Lnw;->e:Landroid/view/ViewGroup;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    .line 913
    iget-object v0, p1, Lnw;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 914
    if-eqz v0, :cond_9

    instance-of v4, v0, Landroid/view/ViewGroup;

    if-eqz v4, :cond_9

    .line 915
    check-cast v0, Landroid/view/ViewGroup;

    iget-object v4, p1, Lnw;->f:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 917
    :cond_9
    iget-object v0, p1, Lnw;->e:Landroid/view/ViewGroup;

    iget-object v4, p1, Lnw;->f:Landroid/view/View;

    invoke-virtual {v0, v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 923
    iget-object v0, p1, Lnw;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_a

    .line 924
    iget-object v0, p1, Lnw;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_a
    move v1, v2

    .line 935
    :cond_b
    :goto_8
    iput-boolean v3, p1, Lnw;->l:Z

    .line 937
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v5, 0x3ea

    const/high16 v6, 0x820000

    const/4 v7, -0x3

    move v4, v3

    invoke-direct/range {v0 .. v7}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 944
    iget v1, p1, Lnw;->c:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 945
    iget v1, p1, Lnw;->d:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 947
    iget-object v1, p1, Lnw;->e:Landroid/view/ViewGroup;

    invoke-interface {v8, v1, v0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 948
    iput-boolean v9, p1, Lnw;->m:Z

    goto/16 :goto_0

    .line 15684
    :cond_c
    sget v1, La;->bZ:I

    invoke-virtual {v4, v1, v9}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    goto/16 :goto_3

    .line 895
    :cond_d
    iget-boolean v0, p1, Lnw;->o:Z

    if-eqz v0, :cond_8

    iget-object v0, p1, Lnw;->e:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_8

    .line 897
    iget-object v0, p1, Lnw;->e:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    goto/16 :goto_4

    .line 16051
    :cond_e
    iget-object v0, p1, Lnw;->h:Lqa;

    if-eqz v0, :cond_12

    .line 16055
    iget-object v0, p0, Lno;->w:Lnx;

    if-nez v0, :cond_f

    .line 16056
    new-instance v0, Lnx;

    .line 16534
    invoke-direct {v0, p0}, Lnx;-><init>(Lno;)V

    .line 16056
    iput-object v0, p0, Lno;->w:Lnx;

    .line 16059
    :cond_f
    iget-object v0, p0, Lno;->w:Lnx;

    .line 16713
    iget-object v1, p1, Lnw;->h:Lqa;

    if-nez v1, :cond_10

    const/4 v0, 0x0

    .line 16061
    :goto_9
    check-cast v0, Landroid/view/View;

    iput-object v0, p1, Lnw;->f:Landroid/view/View;

    .line 16063
    iget-object v0, p1, Lnw;->f:Landroid/view/View;

    if-eqz v0, :cond_12

    move v0, v9

    goto/16 :goto_5

    .line 16715
    :cond_10
    iget-object v1, p1, Lnw;->i:Lpy;

    if-nez v1, :cond_11

    .line 16716
    new-instance v1, Lpy;

    iget-object v4, p1, Lnw;->j:Landroid/content/Context;

    sget v5, La;->bL:I

    invoke-direct {v1, v4, v5}, Lpy;-><init>(Landroid/content/Context;I)V

    iput-object v1, p1, Lnw;->i:Lpy;

    .line 16718
    iget-object v1, p1, Lnw;->i:Lpy;

    .line 17134
    iput-object v0, v1, Lpy;->d:Lqq;

    .line 16719
    iget-object v0, p1, Lnw;->h:Lqa;

    iget-object v1, p1, Lnw;->i:Lpy;

    invoke-virtual {v0, v1}, Lqa;->a(Lqp;)V

    .line 16722
    :cond_11
    iget-object v0, p1, Lnw;->i:Lpy;

    iget-object v1, p1, Lnw;->e:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lpy;->a(Landroid/view/ViewGroup;)Lqr;

    move-result-object v0

    goto :goto_9

    :cond_12
    move v0, v3

    .line 16063
    goto/16 :goto_5

    .line 17655
    :cond_13
    iget-object v0, p1, Lnw;->i:Lpy;

    invoke-virtual {v0}, Lpy;->b()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-lez v0, :cond_14

    move v0, v9

    goto/16 :goto_6

    :cond_14
    move v0, v3

    goto/16 :goto_6

    .line 926
    :cond_15
    iget-object v0, p1, Lnw;->g:Landroid/view/View;

    if-eqz v0, :cond_16

    .line 929
    iget-object v0, p1, Lnw;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 930
    if-eqz v0, :cond_16

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-eq v0, v1, :cond_b

    :cond_16
    move v1, v2

    goto/16 :goto_8

    :cond_17
    move-object v1, v0

    goto/16 :goto_7
.end method

.method private a(Lnw;ILandroid/view/KeyEvent;I)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1345
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1365
    :cond_0
    :goto_0
    return v0

    .line 1353
    :cond_1
    iget-boolean v1, p1, Lnw;->k:Z

    if-nez v1, :cond_2

    invoke-direct {p0, p1, p3}, Lno;->b(Lnw;Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    iget-object v1, p1, Lnw;->h:Lqa;

    if-eqz v1, :cond_0

    .line 1355
    iget-object v0, p1, Lnw;->h:Lqa;

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p3, v1}, Lqa;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v0

    goto :goto_0
.end method

.method static synthetic b(Lno;I)I
    .locals 8

    .prologue
    const/4 v6, -0x1

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 89
    .line 22413
    iget-object v0, p0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    if-eqz v0, :cond_c

    .line 22414
    iget-object v0, p0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_c

    .line 22415
    iget-object v0, p0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 22419
    iget-object v1, p0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->isShown()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 22420
    iget-object v1, p0, Lno;->I:Landroid/graphics/Rect;

    if-nez v1, :cond_0

    .line 22421
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lno;->I:Landroid/graphics/Rect;

    .line 22422
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lno;->J:Landroid/graphics/Rect;

    .line 22424
    :cond_0
    iget-object v1, p0, Lno;->I:Landroid/graphics/Rect;

    .line 22425
    iget-object v4, p0, Lno;->J:Landroid/graphics/Rect;

    .line 22426
    invoke-virtual {v1, v2, p1, v2, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 22428
    iget-object v5, p0, Lno;->s:Landroid/view/ViewGroup;

    invoke-static {v5, v1, v4}, Ltm;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 22429
    iget v1, v4, Landroid/graphics/Rect;->top:I

    if-nez v1, :cond_4

    move v1, p1

    .line 22430
    :goto_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eq v4, v1, :cond_b

    .line 22432
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 22434
    iget-object v1, p0, Lno;->A:Landroid/view/View;

    if-nez v1, :cond_5

    .line 22435
    new-instance v1, Landroid/view/View;

    iget-object v4, p0, Lno;->a:Landroid/content/Context;

    invoke-direct {v1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lno;->A:Landroid/view/View;

    .line 22436
    iget-object v1, p0, Lno;->A:Landroid/view/View;

    iget-object v4, p0, Lno;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, La;->Y:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 22438
    iget-object v1, p0, Lno;->s:Landroid/view/ViewGroup;

    iget-object v4, p0, Lno;->A:Landroid/view/View;

    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v5, v6, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v4, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    move v1, v3

    .line 22452
    :goto_1
    iget-object v4, p0, Lno;->A:Landroid/view/View;

    if-eqz v4, :cond_7

    .line 22458
    :goto_2
    iget-boolean v4, p0, Lno;->i:Z

    if-nez v4, :cond_1

    if-eqz v3, :cond_1

    move p1, v2

    :cond_1
    move v7, v1

    move v1, v3

    move v3, v7

    .line 22468
    :goto_3
    if-eqz v3, :cond_2

    .line 22469
    iget-object v3, p0, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    move v0, v1

    .line 22473
    :goto_4
    iget-object v1, p0, Lno;->A:Landroid/view/View;

    if-eqz v1, :cond_3

    .line 22474
    iget-object v1, p0, Lno;->A:Landroid/view/View;

    if-eqz v0, :cond_9

    :goto_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 89
    :cond_3
    return p1

    :cond_4
    move v1, v2

    .line 22429
    goto :goto_0

    .line 22442
    :cond_5
    iget-object v1, p0, Lno;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 22443
    iget v4, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v4, p1, :cond_6

    .line 22444
    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 22445
    iget-object v4, p0, Lno;->A:Landroid/view/View;

    invoke-virtual {v4, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_6
    move v1, v3

    goto :goto_1

    :cond_7
    move v3, v2

    .line 22452
    goto :goto_2

    .line 22463
    :cond_8
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz v1, :cond_a

    .line 22465
    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move v1, v2

    goto :goto_3

    .line 22474
    :cond_9
    const/16 v2, 0x8

    goto :goto_5

    :cond_a
    move v3, v2

    move v1, v2

    goto :goto_3

    :cond_b
    move v1, v2

    goto :goto_1

    :cond_c
    move v0, v2

    goto :goto_4
.end method

.method private b(Lnw;Landroid/view/KeyEvent;)Z
    .locals 10

    .prologue
    const/16 v5, 0x8

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 1067
    .line 18229
    iget-boolean v0, p0, Lni;->m:Z

    .line 1067
    if-eqz v0, :cond_1

    .line 1167
    :cond_0
    :goto_0
    return v4

    .line 1072
    :cond_1
    iget-boolean v0, p1, Lnw;->k:Z

    if-eqz v0, :cond_2

    move v4, v3

    .line 1073
    goto :goto_0

    .line 1076
    :cond_2
    iget-object v0, p0, Lno;->F:Lnw;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lno;->F:Lnw;

    if-eq v0, p1, :cond_3

    .line 1078
    iget-object v0, p0, Lno;->F:Lnw;

    invoke-virtual {p0, v0, v4}, Lno;->a(Lnw;Z)V

    .line 18233
    :cond_3
    iget-object v0, p0, Lni;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v7

    .line 1083
    if-eqz v7, :cond_4

    .line 1084
    iget v0, p1, Lnw;->a:I

    invoke-interface {v7, v0}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Lnw;->g:Landroid/view/View;

    .line 1087
    :cond_4
    iget v0, p1, Lnw;->a:I

    if-eqz v0, :cond_5

    iget v0, p1, Lnw;->a:I

    if-ne v0, v5, :cond_f

    :cond_5
    move v6, v3

    .line 1090
    :goto_1
    if-eqz v6, :cond_6

    iget-object v0, p0, Lno;->n:Lsd;

    if-eqz v0, :cond_6

    .line 1093
    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0}, Lsd;->g()V

    .line 1096
    :cond_6
    iget-object v0, p1, Lnw;->g:Landroid/view/View;

    if-nez v0, :cond_16

    if-eqz v6, :cond_7

    .line 19103
    iget-object v0, p0, Lni;->f:Lmj;

    .line 1096
    instance-of v0, v0, Lou;

    if-nez v0, :cond_16

    .line 1100
    :cond_7
    iget-object v0, p1, Lnw;->h:Lqa;

    if-eqz v0, :cond_8

    iget-boolean v0, p1, Lnw;->p:Z

    if-eqz v0, :cond_12

    .line 1101
    :cond_8
    iget-object v0, p1, Lnw;->h:Lqa;

    if-nez v0, :cond_c

    .line 20003
    iget-object v2, p0, Lno;->a:Landroid/content/Context;

    .line 20006
    iget v0, p1, Lnw;->a:I

    if-eqz v0, :cond_9

    iget v0, p1, Lnw;->a:I

    if-ne v0, v5, :cond_19

    :cond_9
    iget-object v0, p0, Lno;->n:Lsd;

    if-eqz v0, :cond_19

    .line 20008
    new-instance v5, Landroid/util/TypedValue;

    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 20009
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    .line 20010
    sget v0, La;->l:I

    invoke-virtual {v8, v0, v5, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 20013
    iget v0, v5, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_10

    .line 20014
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    .line 20015
    invoke-virtual {v0, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 20016
    iget v9, v5, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v0, v9, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 20017
    sget v9, La;->m:I

    invoke-virtual {v0, v9, v5, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 20024
    :goto_2
    iget v9, v5, Landroid/util/TypedValue;->resourceId:I

    if-eqz v9, :cond_b

    .line 20025
    if-nez v0, :cond_a

    .line 20026
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    .line 20027
    invoke-virtual {v0, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 20029
    :cond_a
    iget v5, v5, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v0, v5, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_b
    move-object v5, v0

    .line 20032
    if-eqz v5, :cond_19

    .line 20033
    new-instance v0, Lpi;

    invoke-direct {v0, v2, v4}, Lpi;-><init>(Landroid/content/Context;I)V

    .line 20034
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 20038
    :goto_3
    new-instance v2, Lqa;

    invoke-direct {v2, v0}, Lqa;-><init>(Landroid/content/Context;)V

    .line 20039
    invoke-virtual {v2, p0}, Lqa;->a(Lqb;)V

    .line 20040
    invoke-virtual {p1, v2}, Lnw;->a(Lqa;)V

    .line 1102
    iget-object v0, p1, Lnw;->h:Lqa;

    if-eqz v0, :cond_0

    .line 1107
    :cond_c
    if-eqz v6, :cond_e

    iget-object v0, p0, Lno;->n:Lsd;

    if-eqz v0, :cond_e

    .line 1108
    iget-object v0, p0, Lno;->v:Lnt;

    if-nez v0, :cond_d

    .line 1109
    new-instance v0, Lnt;

    .line 20564
    invoke-direct {v0, p0}, Lnt;-><init>(Lno;)V

    .line 1109
    iput-object v0, p0, Lno;->v:Lnt;

    .line 1111
    :cond_d
    iget-object v0, p0, Lno;->n:Lsd;

    iget-object v2, p1, Lnw;->h:Lqa;

    iget-object v5, p0, Lno;->v:Lnt;

    invoke-interface {v0, v2, v5}, Lsd;->a(Landroid/view/Menu;Lqq;)V

    .line 1116
    :cond_e
    iget-object v0, p1, Lnw;->h:Lqa;

    invoke-virtual {v0}, Lqa;->d()V

    .line 1117
    iget v0, p1, Lnw;->a:I

    iget-object v2, p1, Lnw;->h:Lqa;

    invoke-interface {v7, v0, v2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 1119
    invoke-virtual {p1, v1}, Lnw;->a(Lqa;)V

    .line 1121
    if-eqz v6, :cond_0

    iget-object v0, p0, Lno;->n:Lsd;

    if-eqz v0, :cond_0

    .line 1123
    iget-object v0, p0, Lno;->n:Lsd;

    iget-object v2, p0, Lno;->v:Lnt;

    invoke-interface {v0, v1, v2}, Lsd;->a(Landroid/view/Menu;Lqq;)V

    goto/16 :goto_0

    :cond_f
    move v6, v4

    .line 1087
    goto/16 :goto_1

    .line 20020
    :cond_10
    sget v0, La;->m:I

    invoke-virtual {v8, v0, v5, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-object v0, v1

    goto :goto_2

    .line 1129
    :cond_11
    iput-boolean v4, p1, Lnw;->p:Z

    .line 1134
    :cond_12
    iget-object v0, p1, Lnw;->h:Lqa;

    invoke-virtual {v0}, Lqa;->d()V

    .line 1138
    iget-object v0, p1, Lnw;->q:Landroid/os/Bundle;

    if-eqz v0, :cond_13

    .line 1139
    iget-object v0, p1, Lnw;->h:Lqa;

    iget-object v2, p1, Lnw;->q:Landroid/os/Bundle;

    invoke-virtual {v0, v2}, Lqa;->b(Landroid/os/Bundle;)V

    .line 1140
    iput-object v1, p1, Lnw;->q:Landroid/os/Bundle;

    .line 1144
    :cond_13
    iget-object v0, p1, Lnw;->g:Landroid/view/View;

    iget-object v2, p1, Lnw;->h:Lqa;

    invoke-interface {v7, v4, v0, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 1145
    if-eqz v6, :cond_14

    iget-object v0, p0, Lno;->n:Lsd;

    if-eqz v0, :cond_14

    .line 1148
    iget-object v0, p0, Lno;->n:Lsd;

    iget-object v2, p0, Lno;->v:Lnt;

    invoke-interface {v0, v1, v2}, Lsd;->a(Landroid/view/Menu;Lqq;)V

    .line 1150
    :cond_14
    iget-object v0, p1, Lnw;->h:Lqa;

    invoke-virtual {v0}, Lqa;->e()V

    goto/16 :goto_0

    .line 1155
    :cond_15
    if-eqz p2, :cond_17

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v0

    :goto_4
    invoke-static {v0}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v0

    .line 1157
    invoke-virtual {v0}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v0

    if-eq v0, v3, :cond_18

    move v0, v3

    :goto_5
    iput-boolean v0, p1, Lnw;->n:Z

    .line 1158
    iget-object v0, p1, Lnw;->h:Lqa;

    iget-boolean v1, p1, Lnw;->n:Z

    invoke-virtual {v0, v1}, Lqa;->setQwertyMode(Z)V

    .line 1159
    iget-object v0, p1, Lnw;->h:Lqa;

    invoke-virtual {v0}, Lqa;->e()V

    .line 1163
    :cond_16
    iput-boolean v3, p1, Lnw;->k:Z

    .line 1164
    iput-boolean v4, p1, Lnw;->l:Z

    .line 1165
    iput-object p1, p0, Lno;->F:Lnw;

    move v4, v3

    .line 1167
    goto/16 :goto_0

    .line 1155
    :cond_17
    const/4 v0, -0x1

    goto :goto_4

    :cond_18
    move v0, v4

    .line 1157
    goto :goto_5

    :cond_19
    move-object v0, v2

    goto/16 :goto_3
.end method

.method private f(I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1369
    iget v0, p0, Lno;->u:I

    shl-int v1, v2, p1

    or-int/2addr v0, v1

    iput v0, p0, Lno;->u:I

    .line 1371
    iget-boolean v0, p0, Lno;->t:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lno;->y:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 1372
    iget-object v0, p0, Lno;->y:Landroid/view/ViewGroup;

    iget-object v1, p0, Lno;->G:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lgt;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1373
    iput-boolean v2, p0, Lno;->t:Z

    .line 1375
    :cond_0
    return-void
.end method

.method private l()V
    .locals 8

    .prologue
    const v5, 0x1020002

    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 271
    iget-boolean v0, p0, Lno;->x:Z

    if-nez v0, :cond_19

    .line 272
    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 274
    iget-boolean v1, p0, Lno;->k:Z

    if-nez v1, :cond_5

    .line 275
    iget-boolean v1, p0, Lno;->j:Z

    if-eqz v1, :cond_1

    .line 277
    sget v1, La;->bH:I

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    .line 281
    iput-boolean v6, p0, Lno;->h:Z

    iput-boolean v6, p0, Lno;->g:Z

    .line 362
    :cond_0
    :goto_0
    iget-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    if-nez v0, :cond_8

    .line 363
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "AppCompat does not support the current theme features"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 282
    :cond_1
    iget-boolean v0, p0, Lno;->g:Z

    if-eqz v0, :cond_0

    .line 288
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 289
    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v2, La;->l:I

    invoke-virtual {v0, v2, v1, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 292
    iget v0, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_4

    .line 293
    new-instance v0, Lpi;

    iget-object v2, p0, Lno;->a:Landroid/content/Context;

    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v0, v2, v1}, Lpi;-><init>(Landroid/content/Context;I)V

    .line 299
    :goto_1
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->bQ:I

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    .line 302
    iget-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    sget v1, La;->bd:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lsd;

    iput-object v0, p0, Lno;->n:Lsd;

    .line 304
    iget-object v0, p0, Lno;->n:Lsd;

    .line 3233
    iget-object v1, p0, Lni;->b:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    .line 304
    invoke-interface {v0, v1}, Lsd;->a(Landroid/view/Window$Callback;)V

    .line 309
    iget-boolean v0, p0, Lno;->h:Z

    if-eqz v0, :cond_2

    .line 310
    iget-object v0, p0, Lno;->n:Lsd;

    const/16 v1, 0x9

    invoke-interface {v0, v1}, Lsd;->a(I)V

    .line 312
    :cond_2
    iget-boolean v0, p0, Lno;->B:Z

    if-eqz v0, :cond_3

    .line 313
    iget-object v0, p0, Lno;->n:Lsd;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lsd;->a(I)V

    .line 315
    :cond_3
    iget-boolean v0, p0, Lno;->C:Z

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lno;->n:Lsd;

    const/4 v1, 0x5

    invoke-interface {v0, v1}, Lsd;->a(I)V

    goto :goto_0

    .line 295
    :cond_4
    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    goto :goto_1

    .line 320
    :cond_5
    iget-boolean v1, p0, Lno;->i:Z

    if-eqz v1, :cond_6

    .line 321
    sget v1, La;->bP:I

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    .line 327
    :goto_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_7

    .line 330
    iget-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    new-instance v1, Lnq;

    invoke-direct {v1, p0}, Lnq;-><init>(Lno;)V

    invoke-static {v0, v1}, Lgt;->a(Landroid/view/View;Lgm;)V

    goto/16 :goto_0

    .line 324
    :cond_6
    sget v1, La;->bO:I

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    goto :goto_2

    .line 352
    :cond_7
    iget-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    check-cast v0, Lsg;

    new-instance v1, Lnr;

    invoke-direct {v1, p0}, Lnr;-><init>(Lno;)V

    invoke-interface {v0, v1}, Lsg;->a(Lsh;)V

    goto/16 :goto_0

    .line 367
    :cond_8
    iget-object v0, p0, Lno;->n:Lsd;

    if-nez v0, :cond_9

    .line 368
    iget-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    sget v1, La;->bx:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lno;->z:Landroid/widget/TextView;

    .line 372
    :cond_9
    iget-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    invoke-static {v0}, Ltm;->b(Landroid/view/View;)V

    .line 374
    iget-object v0, p0, Lno;->b:Landroid/view/Window;

    invoke-virtual {v0, v5}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 375
    iget-object v1, p0, Lno;->s:Landroid/view/ViewGroup;

    sget v2, La;->aQ:I

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v7/internal/widget/ContentFrameLayout;

    .line 380
    :goto_3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-lez v2, :cond_a

    .line 381
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 382
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 383
    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ContentFrameLayout;->addView(Landroid/view/View;)V

    goto :goto_3

    .line 387
    :cond_a
    iget-object v2, p0, Lno;->b:Landroid/view/Window;

    iget-object v3, p0, Lno;->s:Landroid/view/ViewGroup;

    invoke-virtual {v2, v3}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 391
    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setId(I)V

    .line 392
    invoke-virtual {v1, v5}, Landroid/support/v7/internal/widget/ContentFrameLayout;->setId(I)V

    .line 396
    instance-of v2, v0, Landroid/widget/FrameLayout;

    if-eqz v2, :cond_b

    .line 397
    check-cast v0, Landroid/widget/FrameLayout;

    invoke-virtual {v0, v4}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 3246
    :cond_b
    iget-object v0, p0, Lni;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_1a

    .line 3247
    iget-object v0, p0, Lni;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    .line 402
    :goto_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_c

    .line 403
    invoke-virtual {p0, v0}, Lno;->b(Ljava/lang/CharSequence;)V

    .line 3431
    :cond_c
    iget-object v0, p0, Lno;->y:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    iget-object v2, p0, Lno;->y:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    iget-object v3, p0, Lno;->y:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v3

    iget-object v4, p0, Lno;->y:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v4

    .line 4072
    iget-object v5, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->g:Landroid/graphics/Rect;

    invoke-virtual {v5, v0, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 4073
    invoke-static {v1}, Lgt;->u(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 4074
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ContentFrameLayout;->requestLayout()V

    .line 3436
    :cond_d
    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    sget-object v2, Loq;->bN:[I

    invoke-virtual {v0, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 3437
    sget v2, Loq;->bY:I

    .line 4156
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->a:Landroid/util/TypedValue;

    if-nez v3, :cond_e

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    iput-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->a:Landroid/util/TypedValue;

    .line 4157
    :cond_e
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->a:Landroid/util/TypedValue;

    .line 3437
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 3438
    sget v2, Loq;->bZ:I

    .line 4161
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->b:Landroid/util/TypedValue;

    if-nez v3, :cond_f

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    iput-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->b:Landroid/util/TypedValue;

    .line 4162
    :cond_f
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->b:Landroid/util/TypedValue;

    .line 3438
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 3440
    sget v2, Loq;->bW:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 3441
    sget v2, Loq;->bW:I

    .line 4166
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->c:Landroid/util/TypedValue;

    if-nez v3, :cond_10

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    iput-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->c:Landroid/util/TypedValue;

    .line 4167
    :cond_10
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->c:Landroid/util/TypedValue;

    .line 3441
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 3444
    :cond_11
    sget v2, Loq;->bX:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 3445
    sget v2, Loq;->bX:I

    .line 4171
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->d:Landroid/util/TypedValue;

    if-nez v3, :cond_12

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    iput-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->d:Landroid/util/TypedValue;

    .line 4172
    :cond_12
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->d:Landroid/util/TypedValue;

    .line 3445
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 3448
    :cond_13
    sget v2, Loq;->bU:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_15

    .line 3449
    sget v2, Loq;->bU:I

    .line 4176
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->e:Landroid/util/TypedValue;

    if-nez v3, :cond_14

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    iput-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->e:Landroid/util/TypedValue;

    .line 4177
    :cond_14
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->e:Landroid/util/TypedValue;

    .line 3449
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 3452
    :cond_15
    sget v2, Loq;->bV:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 3453
    sget v2, Loq;->bV:I

    .line 4181
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->f:Landroid/util/TypedValue;

    if-nez v3, :cond_16

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    iput-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->f:Landroid/util/TypedValue;

    .line 4182
    :cond_16
    iget-object v3, v1, Landroid/support/v7/internal/widget/ContentFrameLayout;->f:Landroid/util/TypedValue;

    .line 3453
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 3456
    :cond_17
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 3458
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ContentFrameLayout;->requestLayout()V

    .line 410
    iput-boolean v7, p0, Lno;->x:Z

    .line 417
    invoke-virtual {p0, v6}, Lno;->e(I)Lnw;

    move-result-object v0

    .line 4229
    iget-boolean v1, p0, Lni;->m:Z

    .line 418
    if-nez v1, :cond_19

    if-eqz v0, :cond_18

    iget-object v0, v0, Lnw;->h:Lqa;

    if-nez v0, :cond_19

    .line 419
    :cond_18
    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lno;->f(I)V

    .line 422
    :cond_19
    return-void

    .line 3250
    :cond_1a
    iget-object v0, p0, Lni;->l:Ljava/lang/CharSequence;

    goto/16 :goto_4
.end method

.method private m()V
    .locals 2

    .prologue
    .line 1481
    iget-boolean v0, p0, Lno;->x:Z

    if-eqz v0, :cond_0

    .line 1482
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1485
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 830
    invoke-virtual {p0, p1, p2, p3, p4}, Lno;->b(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 831
    if-eqz v0, :cond_0

    .line 14109
    :goto_0
    return-object v0

    .line 13789
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-ge v0, v3, :cond_3

    move v0, v1

    .line 13791
    :goto_1
    iget-object v3, p0, Lno;->K:Lot;

    if-nez v3, :cond_1

    .line 13792
    new-instance v3, Lot;

    invoke-direct {v3}, Lot;-><init>()V

    iput-object v3, p0, Lno;->K:Lot;

    .line 13796
    :cond_1
    if-eqz v0, :cond_4

    iget-boolean v3, p0, Lno;->x:Z

    if-eqz v3, :cond_4

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    const v4, 0x1020002

    if-eq v3, v4, :cond_4

    invoke-static {p1}, Lgt;->v(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_4

    move v3, v1

    .line 13806
    :goto_2
    iget-object v4, p0, Lno;->K:Lot;

    .line 14074
    if-eqz v3, :cond_6

    if-eqz p1, :cond_6

    .line 14075
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 14079
    :goto_3
    invoke-static {v3, p4, v0, v1}, Lot;->a(Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Landroid/content/Context;

    move-result-object v3

    .line 14083
    const/4 v0, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    :cond_2
    move v2, v0

    :goto_4
    packed-switch v2, :pswitch_data_0

    .line 14106
    if-eq p3, v3, :cond_5

    .line 14109
    invoke-virtual {v4, v3, p2, p4}, Lot;->a(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_3
    move v0, v2

    .line 13789
    goto :goto_1

    :cond_4
    move v3, v2

    .line 13796
    goto :goto_2

    .line 14083
    :sswitch_0
    const-string v1, "EditText"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_4

    :sswitch_1
    const-string v2, "Spinner"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v1

    goto :goto_4

    :sswitch_2
    const-string v1, "CheckBox"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x2

    goto :goto_4

    :sswitch_3
    const-string v1, "RadioButton"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x3

    goto :goto_4

    :sswitch_4
    const-string v1, "CheckedTextView"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x4

    goto :goto_4

    :sswitch_5
    const-string v1, "AutoCompleteTextView"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x5

    goto :goto_4

    :sswitch_6
    const-string v1, "MultiAutoCompleteTextView"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x6

    goto :goto_4

    :sswitch_7
    const-string v1, "RatingBar"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x7

    goto :goto_4

    :sswitch_8
    const-string v1, "Button"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v2, 0x8

    goto :goto_4

    :sswitch_9
    const-string v1, "TextView"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v2, 0x9

    goto :goto_4

    .line 14085
    :pswitch_0
    new-instance v0, Lwo;

    invoke-direct {v0, v3, p4}, Lwo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_0

    .line 14087
    :pswitch_1
    new-instance v0, Lws;

    invoke-direct {v0, v3, p4}, Lws;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_0

    .line 14089
    :pswitch_2
    new-instance v0, Lwm;

    invoke-direct {v0, v3, p4}, Lwm;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_0

    .line 14091
    :pswitch_3
    new-instance v0, Lwq;

    invoke-direct {v0, v3, p4}, Lwq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_0

    .line 14093
    :pswitch_4
    new-instance v0, Lwn;

    invoke-direct {v0, v3, p4}, Lwn;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_0

    .line 14095
    :pswitch_5
    new-instance v0, Lwk;

    invoke-direct {v0, v3, p4}, Lwk;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_0

    .line 14097
    :pswitch_6
    new-instance v0, Lwp;

    invoke-direct {v0, v3, p4}, Lwp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_0

    .line 14099
    :pswitch_7
    new-instance v0, Lwr;

    invoke-direct {v0, v3, p4}, Lwr;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_0

    .line 14101
    :pswitch_8
    new-instance v0, Lwl;

    invoke-direct {v0, v3, p4}, Lwl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_0

    .line 14103
    :pswitch_9
    new-instance v0, Lwt;

    invoke-direct {v0, v3, p4}, Lwt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_0

    .line 14112
    :cond_5
    const/4 v0, 0x0

    .line 836
    goto/16 :goto_0

    :cond_6
    move-object v3, p3

    goto/16 :goto_3

    .line 14083
    nop

    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_7
        -0x56c015e7 -> :sswitch_4
        -0x503aa7ad -> :sswitch_6
        -0x37f7066e -> :sswitch_9
        -0x1440b607 -> :sswitch_1
        0x2e46a6ed -> :sswitch_3
        0x5445f9ba -> :sswitch_5
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_0
        0x77471352 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method a(Landroid/view/Menu;)Lnw;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 1315
    iget-object v3, p0, Lno;->E:[Lnw;

    .line 1316
    if-eqz v3, :cond_0

    array-length v0, v3

    :goto_0
    move v2, v1

    .line 1317
    :goto_1
    if-ge v2, v0, :cond_2

    .line 1318
    aget-object v1, v3, v2

    .line 1319
    if-eqz v1, :cond_1

    iget-object v4, v1, Lnw;->h:Lqa;

    if-ne v4, p1, :cond_1

    move-object v0, v1

    .line 1323
    :goto_2
    return-object v0

    :cond_0
    move v0, v1

    .line 1316
    goto :goto_0

    .line 1317
    :cond_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 1323
    :cond_2
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 246
    invoke-direct {p0}, Lno;->l()V

    .line 247
    iget-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 248
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 249
    iget-object v1, p0, Lno;->a:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 250
    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    .line 251
    return-void
.end method

.method a(ILnw;Landroid/view/Menu;)V
    .locals 1

    .prologue
    .line 1290
    if-nez p3, :cond_1

    .line 1292
    if-nez p2, :cond_0

    .line 1293
    if-ltz p1, :cond_0

    iget-object v0, p0, Lno;->E:[Lnw;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    .line 1294
    iget-object v0, p0, Lno;->E:[Lnw;

    aget-object p2, v0, p1

    .line 1298
    :cond_0
    if-eqz p2, :cond_1

    .line 1300
    iget-object p3, p2, Lnw;->h:Lqa;

    .line 1305
    :cond_1
    if-eqz p2, :cond_3

    iget-boolean v0, p2, Lnw;->m:Z

    if-nez v0, :cond_3

    .line 1312
    :cond_2
    :goto_0
    return-void

    .line 22233
    :cond_3
    iget-object v0, p0, Lni;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    .line 1309
    if-eqz v0, :cond_2

    .line 1310
    invoke-interface {v0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_0
.end method

.method public final a(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 209
    iget-boolean v0, p0, Lno;->g:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lno;->x:Z

    if-eqz v0, :cond_0

    .line 212
    invoke-virtual {p0}, Lno;->a()Lmj;

    move-result-object v0

    .line 213
    if-eqz v0, :cond_0

    .line 214
    invoke-virtual {v0, p1}, Lmj;->a(Landroid/content/res/Configuration;)V

    .line 217
    :cond_0
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 146
    invoke-super {p0, p1}, Lni;->a(Landroid/os/Bundle;)V

    .line 148
    iget-object v0, p0, Lno;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lno;->y:Landroid/view/ViewGroup;

    .line 150
    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lat;->b(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2103
    iget-object v0, p0, Lni;->f:Lmj;

    .line 154
    if-nez v0, :cond_1

    .line 155
    iput-boolean v1, p0, Lno;->H:Z

    .line 161
    :cond_0
    :goto_0
    return-void

    .line 157
    :cond_1
    invoke-virtual {v0, v1}, Lmj;->c(Z)V

    goto :goto_0
.end method

.method public final a(Landroid/support/v7/widget/Toolbar;)V
    .locals 3

    .prologue
    .line 186
    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 203
    :goto_0
    return-void

    .line 191
    :cond_0
    invoke-virtual {p0}, Lno;->a()Lmj;

    move-result-object v0

    .line 192
    instance-of v0, v0, Lpb;

    if-eqz v0, :cond_1

    .line 193
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 198
    :cond_1
    new-instance v1, Lou;

    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v2, p0, Lno;->d:Landroid/view/Window$Callback;

    invoke-direct {v1, p1, v0, v2}, Lou;-><init>(Landroid/support/v7/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V

    .line 2107
    iput-object v1, p0, Lni;->f:Lmj;

    .line 201
    iget-object v0, p0, Lno;->b:Landroid/view/Window;

    .line 3085
    iget-object v2, v1, Lou;->c:Landroid/view/Window$Callback;

    .line 201
    invoke-virtual {v0, v2}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 202
    invoke-virtual {v1}, Lou;->f()Z

    goto :goto_0
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 237
    invoke-direct {p0}, Lno;->l()V

    .line 238
    iget-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 239
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 240
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 241
    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    .line 242
    return-void
.end method

.method public final a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .prologue
    .line 255
    invoke-direct {p0}, Lno;->l()V

    .line 256
    iget-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 257
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 258
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 259
    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    .line 260
    return-void
.end method

.method a(Lnw;Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 1189
    if-eqz p2, :cond_1

    iget v0, p1, Lnw;->a:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lno;->n:Lsd;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0}, Lsd;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1191
    iget-object v0, p1, Lnw;->h:Lqa;

    invoke-virtual {p0, v0}, Lno;->b(Lqa;)V

    .line 1222
    :cond_0
    :goto_0
    return-void

    .line 1195
    :cond_1
    iget-boolean v1, p1, Lnw;->m:Z

    .line 1197
    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    const-string v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 1198
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    iget-object v2, p1, Lnw;->e:Landroid/view/ViewGroup;

    if-eqz v2, :cond_2

    .line 1199
    iget-object v2, p1, Lnw;->e:Landroid/view/ViewGroup;

    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 1202
    :cond_2
    iput-boolean v3, p1, Lnw;->k:Z

    .line 1203
    iput-boolean v3, p1, Lnw;->l:Z

    .line 1204
    iput-boolean v3, p1, Lnw;->m:Z

    .line 1206
    if-eqz v1, :cond_3

    if-eqz p2, :cond_3

    .line 1209
    iget v0, p1, Lnw;->a:I

    invoke-virtual {p0, v0, p1, v4}, Lno;->a(ILnw;Landroid/view/Menu;)V

    .line 1213
    :cond_3
    iput-object v4, p1, Lnw;->f:Landroid/view/View;

    .line 1217
    const/4 v0, 0x1

    iput-boolean v0, p1, Lnw;->o:Z

    .line 1219
    iget-object v0, p0, Lno;->F:Lnw;

    if-ne v0, p1, :cond_0

    .line 1220
    iput-object v4, p0, Lno;->F:Lnw;

    goto :goto_0
.end method

.method public final a(Lqa;)V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x0

    .line 549
    .line 7959
    iget-object v0, p0, Lno;->n:Lsd;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0}, Lsd;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-static {v0}, Lhf;->b(Landroid/view/ViewConfiguration;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0}, Lsd;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 8233
    :cond_0
    iget-object v0, p0, Lni;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    .line 7965
    iget-object v1, p0, Lno;->n:Lsd;

    invoke-interface {v1}, Lsd;->c()Z

    move-result v1

    if-nez v1, :cond_3

    .line 7966
    if-eqz v0, :cond_2

    .line 9229
    iget-boolean v1, p0, Lni;->m:Z

    .line 7966
    if-nez v1, :cond_2

    .line 7968
    iget-boolean v1, p0, Lno;->t:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lno;->u:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    .line 7970
    iget-object v1, p0, Lno;->y:Landroid/view/ViewGroup;

    iget-object v2, p0, Lno;->G:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 7971
    iget-object v1, p0, Lno;->G:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 7974
    :cond_1
    invoke-virtual {p0, v4}, Lno;->e(I)Lnw;

    move-result-object v1

    .line 7978
    iget-object v2, v1, Lnw;->h:Lqa;

    if-eqz v2, :cond_2

    iget-boolean v2, v1, Lnw;->p:Z

    if-nez v2, :cond_2

    iget-object v2, v1, Lnw;->g:Landroid/view/View;

    iget-object v3, v1, Lnw;->h:Lqa;

    invoke-interface {v0, v4, v2, v3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7980
    iget-object v1, v1, Lnw;->h:Lqa;

    invoke-interface {v0, v5, v1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 7981
    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0}, Lsd;->e()Z

    .line 7991
    :cond_2
    :goto_0
    return-void

    .line 7985
    :cond_3
    iget-object v1, p0, Lno;->n:Lsd;

    invoke-interface {v1}, Lsd;->f()Z

    .line 10229
    iget-boolean v1, p0, Lni;->m:Z

    .line 7986
    if-nez v1, :cond_2

    .line 7987
    invoke-virtual {p0, v4}, Lno;->e(I)Lnw;

    move-result-object v1

    .line 7988
    iget-object v1, v1, Lnw;->h:Lqa;

    invoke-interface {v0, v5, v1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_0

    .line 7994
    :cond_4
    invoke-virtual {p0, v4}, Lno;->e(I)Lnw;

    move-result-object v0

    .line 7996
    const/4 v1, 0x1

    iput-boolean v1, v0, Lnw;->o:Z

    .line 7997
    invoke-virtual {p0, v0, v4}, Lno;->a(Lnw;Z)V

    .line 7999
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lno;->a(Lnw;Landroid/view/KeyEvent;)V

    goto :goto_0
.end method

.method final a(ILandroid/view/KeyEvent;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 705
    invoke-virtual {p0}, Lno;->a()Lmj;

    move-result-object v2

    .line 706
    if-eqz v2, :cond_1

    invoke-virtual {v2, p1, p2}, Lmj;->a(ILandroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 736
    :cond_0
    :goto_0
    return v0

    .line 712
    :cond_1
    iget-object v2, p0, Lno;->F:Lnw;

    if-eqz v2, :cond_2

    .line 713
    iget-object v2, p0, Lno;->F:Lnw;

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-direct {p0, v2, v3, p2, v0}, Lno;->a(Lnw;ILandroid/view/KeyEvent;I)Z

    move-result v2

    .line 715
    if-eqz v2, :cond_2

    .line 716
    iget-object v1, p0, Lno;->F:Lnw;

    if-eqz v1, :cond_0

    .line 717
    iget-object v1, p0, Lno;->F:Lnw;

    iput-boolean v0, v1, Lnw;->l:Z

    goto :goto_0

    .line 727
    :cond_2
    iget-object v2, p0, Lno;->F:Lnw;

    if-nez v2, :cond_3

    .line 728
    invoke-virtual {p0, v1}, Lno;->e(I)Lnw;

    move-result-object v2

    .line 729
    invoke-direct {p0, v2, p2}, Lno;->b(Lnw;Landroid/view/KeyEvent;)Z

    .line 730
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-direct {p0, v2, v3, p2, v0}, Lno;->a(Lnw;ILandroid/view/KeyEvent;I)Z

    move-result v3

    .line 731
    iput-boolean v1, v2, Lnw;->k:Z

    .line 732
    if-nez v3, :cond_0

    :cond_3
    move v0, v1

    .line 736
    goto :goto_0
.end method

.method final a(Landroid/view/KeyEvent;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 741
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    .line 742
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    .line 743
    if-nez v0, :cond_1

    move v0, v1

    .line 745
    :goto_0
    if-eqz v0, :cond_4

    .line 10770
    packed-switch v3, :pswitch_data_0

    .line 10780
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_3

    .line 10781
    invoke-virtual {p0, v3, p1}, Lno;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    :goto_1
    move v1, v0

    .line 11762
    :goto_2
    return v1

    :cond_1
    move v0, v2

    .line 743
    goto :goto_0

    .line 11225
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_2

    .line 11226
    invoke-virtual {p0, v2}, Lno;->e(I)Lnw;

    move-result-object v0

    .line 11227
    iget-boolean v4, v0, Lnw;->m:Z

    if-nez v4, :cond_2

    .line 11228
    invoke-direct {p0, v0, p1}, Lno;->b(Lnw;Landroid/view/KeyEvent;)Z

    move-result v0

    .line 10772
    :goto_3
    if-eqz v0, :cond_0

    move v0, v1

    .line 10773
    goto :goto_1

    :cond_2
    move v0, v2

    .line 11232
    goto :goto_3

    :cond_3
    move v1, v2

    .line 745
    goto :goto_2

    .line 11749
    :cond_4
    sparse-switch v3, :sswitch_data_0

    :cond_5
    move v0, v2

    .line 11766
    goto :goto_1

    .line 12236
    :sswitch_0
    iget-object v0, p0, Lno;->o:Lvr;

    if-eqz v0, :cond_6

    move v0, v2

    .line 11751
    :goto_4
    if-eqz v0, :cond_5

    goto :goto_2

    .line 12241
    :cond_6
    invoke-virtual {p0, v2}, Lno;->e(I)Lnw;

    move-result-object v4

    .line 12242
    iget-object v0, p0, Lno;->n:Lsd;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0}, Lsd;->b()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-static {v0}, Lhf;->b(Landroid/view/ViewConfiguration;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 12245
    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0}, Lsd;->c()Z

    move-result v0

    if-nez v0, :cond_8

    .line 13229
    iget-boolean v0, p0, Lni;->m:Z

    .line 12246
    if-nez v0, :cond_10

    invoke-direct {p0, v4, p1}, Lno;->b(Lnw;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 12247
    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0}, Lsd;->e()Z

    move-result v3

    .line 12276
    :goto_5
    if-eqz v3, :cond_7

    .line 12277
    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    const-string v4, "audio"

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    .line 12279
    if-eqz v0, :cond_c

    .line 12280
    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->playSoundEffect(I)V

    :cond_7
    :goto_6
    move v0, v3

    .line 12285
    goto :goto_4

    .line 12250
    :cond_8
    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0}, Lsd;->f()Z

    move-result v3

    goto :goto_5

    .line 12253
    :cond_9
    iget-boolean v0, v4, Lnw;->m:Z

    if-nez v0, :cond_a

    iget-boolean v0, v4, Lnw;->l:Z

    if-eqz v0, :cond_b

    .line 12256
    :cond_a
    iget-boolean v3, v4, Lnw;->m:Z

    .line 12258
    invoke-virtual {p0, v4, v1}, Lno;->a(Lnw;Z)V

    goto :goto_5

    .line 12259
    :cond_b
    iget-boolean v0, v4, Lnw;->k:Z

    if-eqz v0, :cond_10

    .line 12261
    iget-boolean v0, v4, Lnw;->p:Z

    if-eqz v0, :cond_11

    .line 12264
    iput-boolean v2, v4, Lnw;->k:Z

    .line 12265
    invoke-direct {p0, v4, p1}, Lno;->b(Lnw;Landroid/view/KeyEvent;)Z

    move-result v0

    .line 12268
    :goto_7
    if-eqz v0, :cond_10

    .line 12270
    invoke-direct {p0, v4, p1}, Lno;->a(Lnw;Landroid/view/KeyEvent;)V

    move v3, v1

    .line 12271
    goto :goto_5

    .line 12282
    :cond_c
    const-string v0, "AppCompatDelegate"

    const-string v4, "Couldn\'t get audio manager"

    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    .line 11756
    :sswitch_1
    invoke-virtual {p0, v2}, Lno;->e(I)Lnw;

    move-result-object v0

    .line 11757
    if-eqz v0, :cond_d

    iget-boolean v3, v0, Lnw;->m:Z

    if-eqz v3, :cond_d

    .line 11758
    invoke-virtual {p0, v0, v1}, Lno;->a(Lnw;Z)V

    goto/16 :goto_2

    .line 13687
    :cond_d
    iget-object v0, p0, Lno;->o:Lvr;

    if-eqz v0, :cond_e

    .line 13688
    iget-object v0, p0, Lno;->o:Lvr;

    invoke-virtual {v0}, Lvr;->c()V

    move v0, v1

    .line 11761
    :goto_8
    if-eqz v0, :cond_5

    goto/16 :goto_2

    .line 13693
    :cond_e
    invoke-virtual {p0}, Lno;->a()Lmj;

    move-result-object v0

    .line 13694
    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lmj;->g()Z

    move-result v0

    if-eqz v0, :cond_f

    move v0, v1

    .line 13695
    goto :goto_8

    :cond_f
    move v0, v2

    .line 13699
    goto :goto_8

    :cond_10
    move v3, v2

    goto :goto_5

    :cond_11
    move v0, v1

    goto :goto_7

    .line 10770
    nop

    :pswitch_data_0
    .packed-switch 0x52
        :pswitch_0
    .end packed-switch

    .line 11749
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x52 -> :sswitch_0
    .end sparse-switch
.end method

.method public final a(Lqa;Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 537
    .line 6233
    iget-object v0, p0, Lni;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    .line 538
    if-eqz v0, :cond_0

    .line 7229
    iget-boolean v1, p0, Lni;->m:Z

    .line 538
    if-nez v1, :cond_0

    .line 539
    invoke-virtual {p1}, Lqa;->k()Lqa;

    move-result-object v1

    invoke-virtual {p0, v1}, Lno;->a(Landroid/view/Menu;)Lnw;

    move-result-object v1

    .line 540
    if-eqz v1, :cond_0

    .line 541
    iget v1, v1, Lnw;->a:I

    invoke-interface {v0, v1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    .line 544
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method b(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .prologue
    .line 841
    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    instance-of v0, v0, Landroid/view/LayoutInflater$Factory;

    if-eqz v0, :cond_0

    .line 842
    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/view/LayoutInflater$Factory;

    invoke-interface {v0, p2, p3, p4}, Landroid/view/LayoutInflater$Factory;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 844
    if-eqz v0, :cond_0

    .line 848
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .prologue
    .line 264
    invoke-direct {p0}, Lno;->l()V

    .line 265
    iget-object v0, p0, Lno;->s:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 266
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 267
    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    .line 268
    return-void
.end method

.method final b(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 495
    iget-object v0, p0, Lno;->n:Lsd;

    if-eqz v0, :cond_1

    .line 496
    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0, p1}, Lsd;->a(Ljava/lang/CharSequence;)V

    .line 502
    :cond_0
    :goto_0
    return-void

    .line 5103
    :cond_1
    iget-object v0, p0, Lni;->f:Lmj;

    .line 497
    if-eqz v0, :cond_2

    .line 6103
    iget-object v0, p0, Lni;->f:Lmj;

    .line 498
    invoke-virtual {v0, p1}, Lmj;->c(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 499
    :cond_2
    iget-object v0, p0, Lno;->z:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lno;->z:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method b(Lqa;)V
    .locals 2

    .prologue
    .line 1171
    iget-boolean v0, p0, Lno;->D:Z

    if-eqz v0, :cond_0

    .line 1182
    :goto_0
    return-void

    .line 1175
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lno;->D:Z

    .line 1176
    iget-object v0, p0, Lno;->n:Lsd;

    invoke-interface {v0}, Lsd;->h()V

    .line 21233
    iget-object v0, p0, Lni;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    .line 1178
    if-eqz v0, :cond_1

    .line 22229
    iget-boolean v1, p0, Lni;->m:Z

    .line 1178
    if-nez v1, :cond_1

    .line 1179
    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 1181
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lno;->D:Z

    goto :goto_0
.end method

.method public final b(I)Z
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 463
    packed-switch p1, :pswitch_data_0

    .line 490
    :pswitch_0
    iget-object v0, p0, Lno;->b:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result v0

    :goto_0
    return v0

    .line 465
    :pswitch_1
    invoke-direct {p0}, Lno;->m()V

    .line 466
    iput-boolean v0, p0, Lno;->g:Z

    goto :goto_0

    .line 469
    :pswitch_2
    invoke-direct {p0}, Lno;->m()V

    .line 470
    iput-boolean v0, p0, Lno;->h:Z

    goto :goto_0

    .line 473
    :pswitch_3
    invoke-direct {p0}, Lno;->m()V

    .line 474
    iput-boolean v0, p0, Lno;->i:Z

    goto :goto_0

    .line 477
    :pswitch_4
    invoke-direct {p0}, Lno;->m()V

    .line 478
    iput-boolean v0, p0, Lno;->B:Z

    goto :goto_0

    .line 481
    :pswitch_5
    invoke-direct {p0}, Lno;->m()V

    .line 482
    iput-boolean v0, p0, Lno;->C:Z

    goto :goto_0

    .line 485
    :pswitch_6
    invoke-direct {p0}, Lno;->m()V

    .line 486
    iput-boolean v0, p0, Lno;->k:Z

    goto :goto_0

    .line 463
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 166
    invoke-direct {p0}, Lno;->l()V

    .line 167
    return-void
.end method

.method final c(I)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 506
    const/16 v1, 0x8

    if-ne p1, v1, :cond_2

    .line 507
    invoke-virtual {p0}, Lno;->a()Lmj;

    move-result-object v1

    .line 508
    if-eqz v1, :cond_0

    .line 509
    invoke-virtual {v1, v0}, Lmj;->e(Z)V

    .line 511
    :cond_0
    const/4 v0, 0x1

    .line 520
    :cond_1
    :goto_0
    return v0

    .line 512
    :cond_2
    if-nez p1, :cond_1

    .line 515
    invoke-virtual {p0, p1}, Lno;->e(I)Lnw;

    move-result-object v1

    .line 516
    iget-boolean v2, v1, Lnw;->m:Z

    if-eqz v2, :cond_1

    .line 517
    invoke-virtual {p0, v1, v0}, Lno;->a(Lnw;Z)V

    goto :goto_0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 221
    invoke-virtual {p0}, Lno;->a()Lmj;

    move-result-object v0

    .line 222
    if-eqz v0, :cond_0

    .line 223
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmj;->d(Z)V

    .line 225
    :cond_0
    return-void
.end method

.method final d(I)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 525
    const/16 v1, 0x8

    if-ne p1, v1, :cond_1

    .line 526
    invoke-virtual {p0}, Lno;->a()Lmj;

    move-result-object v1

    .line 527
    if-eqz v1, :cond_0

    .line 528
    invoke-virtual {v1, v0}, Lmj;->e(Z)V

    .line 532
    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method e(I)Lnw;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1328
    iget-object v0, p0, Lno;->E:[Lnw;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-gt v1, p1, :cond_2

    .line 1329
    :cond_0
    add-int/lit8 v1, p1, 0x1

    new-array v1, v1, [Lnw;

    .line 1330
    if-eqz v0, :cond_1

    .line 1331
    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1333
    :cond_1
    iput-object v1, p0, Lno;->E:[Lnw;

    move-object v0, v1

    .line 1336
    :cond_2
    aget-object v1, v0, p1

    .line 1337
    if-nez v1, :cond_3

    .line 1338
    new-instance v1, Lnw;

    invoke-direct {v1, p1}, Lnw;-><init>(I)V

    aput-object v1, v0, p1

    move-object v0, v1

    .line 1340
    :goto_0
    return-object v0

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method public final e()V
    .locals 2

    .prologue
    .line 229
    invoke-virtual {p0}, Lno;->a()Lmj;

    move-result-object v0

    .line 230
    if-eqz v0, :cond_0

    .line 231
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lmj;->d(Z)V

    .line 233
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 582
    invoke-virtual {p0}, Lno;->a()Lmj;

    move-result-object v0

    .line 583
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lmj;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 586
    :goto_0
    return-void

    .line 585
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lno;->f(I)V

    goto :goto_0
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 814
    iget-object v0, p0, Lno;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 815
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_0

    .line 816
    invoke-static {v0, p0}, Lfm;->a(Landroid/view/LayoutInflater;Lfs;)V

    .line 821
    :cond_0
    return-void
.end method

.method public final j()Lmj;
    .locals 3

    .prologue
    .line 171
    invoke-direct {p0}, Lno;->l()V

    .line 172
    const/4 v0, 0x0

    .line 173
    iget-object v1, p0, Lno;->c:Landroid/view/Window$Callback;

    instance-of v1, v1, Landroid/app/Activity;

    if-eqz v1, :cond_2

    .line 174
    new-instance v1, Lpb;

    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/app/Activity;

    iget-boolean v2, p0, Lno;->h:Z

    invoke-direct {v1, v0, v2}, Lpb;-><init>(Landroid/app/Activity;Z)V

    move-object v0, v1

    .line 178
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 179
    iget-boolean v1, p0, Lno;->H:Z

    invoke-virtual {v0, v1}, Lmj;->c(Z)V

    .line 181
    :cond_1
    return-object v0

    .line 175
    :cond_2
    iget-object v1, p0, Lno;->c:Landroid/view/Window$Callback;

    instance-of v1, v1, Landroid/app/Dialog;

    if-eqz v1, :cond_0

    .line 176
    new-instance v1, Lpb;

    iget-object v0, p0, Lno;->c:Landroid/view/Window$Callback;

    check-cast v0, Landroid/app/Dialog;

    invoke-direct {v1, v0}, Lpb;-><init>(Landroid/app/Dialog;)V

    move-object v0, v1

    goto :goto_0
.end method
