.class public Lam;
.super Lj;
.source "PG"


# instance fields
.field private Z:Landroid/widget/ListAdapter;

.field a:Landroid/widget/ListView;

.field private aa:Landroid/view/View;

.field private ab:Landroid/widget/TextView;

.field private ac:Landroid/view/View;

.field private ad:Landroid/view/View;

.field private ae:Z

.field private final b:Landroid/os/Handler;

.field private final c:Ljava/lang/Runnable;

.field private final d:Landroid/widget/AdapterView$OnItemClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 71
    invoke-direct {p0}, Lj;-><init>()V

    .line 47
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lam;->b:Landroid/os/Handler;

    .line 49
    new-instance v0, Lan;

    invoke-direct {v0, p0}, Lan;-><init>(Lam;)V

    iput-object v0, p0, Lam;->c:Ljava/lang/Runnable;

    .line 55
    new-instance v0, Lao;

    invoke-direct {v0, p0}, Lao;-><init>(Lam;)V

    iput-object v0, p0, Lam;->d:Landroid/widget/AdapterView$OnItemClickListener;

    .line 72
    return-void
.end method

.method private a(ZZ)V
    .locals 6

    .prologue
    const v5, 0x10a0001

    const/high16 v4, 0x10a0000

    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 280
    invoke-direct {p0}, Lam;->p()V

    .line 281
    iget-object v0, p0, Lam;->ac:Landroid/view/View;

    if-nez v0, :cond_0

    .line 282
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t be used with a custom content view"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 284
    :cond_0
    iget-boolean v0, p0, Lam;->ae:Z

    if-ne v0, p1, :cond_1

    .line 313
    :goto_0
    return-void

    .line 287
    :cond_1
    iput-boolean p1, p0, Lam;->ae:Z

    .line 288
    if-eqz p1, :cond_3

    .line 289
    if-eqz p2, :cond_2

    .line 290
    iget-object v0, p0, Lam;->ac:Landroid/view/View;

    .line 4612
    iget-object v1, p0, Lj;->y:Lm;

    .line 290
    invoke-static {v1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 292
    iget-object v0, p0, Lam;->ad:Landroid/view/View;

    .line 5612
    iget-object v1, p0, Lj;->y:Lm;

    .line 292
    invoke-static {v1, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 298
    :goto_1
    iget-object v0, p0, Lam;->ac:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 299
    iget-object v0, p0, Lam;->ad:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 295
    :cond_2
    iget-object v0, p0, Lam;->ac:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 296
    iget-object v0, p0, Lam;->ad:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    goto :goto_1

    .line 301
    :cond_3
    if-eqz p2, :cond_4

    .line 302
    iget-object v0, p0, Lam;->ac:Landroid/view/View;

    .line 6612
    iget-object v1, p0, Lj;->y:Lm;

    .line 302
    invoke-static {v1, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 304
    iget-object v0, p0, Lam;->ad:Landroid/view/View;

    .line 7612
    iget-object v1, p0, Lj;->y:Lm;

    .line 304
    invoke-static {v1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 310
    :goto_2
    iget-object v0, p0, Lam;->ac:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 311
    iget-object v0, p0, Lam;->ad:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 307
    :cond_4
    iget-object v0, p0, Lam;->ac:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 308
    iget-object v0, p0, Lam;->ad:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    goto :goto_2
.end method

.method private p()V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 323
    iget-object v0, p0, Lam;->a:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    .line 374
    :goto_0
    return-void

    .line 8065
    :cond_0
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 327
    if-nez v0, :cond_1

    .line 328
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Content view not yet created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 330
    :cond_1
    instance-of v1, v0, Landroid/widget/ListView;

    if-eqz v1, :cond_5

    .line 331
    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lam;->a:Landroid/widget/ListView;

    .line 360
    :cond_2
    :goto_1
    iput-boolean v2, p0, Lam;->ae:Z

    .line 361
    iget-object v0, p0, Lam;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lam;->d:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 362
    iget-object v0, p0, Lam;->Z:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_a

    .line 363
    iget-object v1, p0, Lam;->Z:Landroid/widget/ListAdapter;

    .line 364
    const/4 v0, 0x0

    iput-object v0, p0, Lam;->Z:Landroid/widget/ListAdapter;

    .line 8179
    iget-object v0, p0, Lam;->Z:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_9

    move v0, v2

    .line 8180
    :goto_2
    iput-object v1, p0, Lam;->Z:Landroid/widget/ListAdapter;

    .line 8181
    iget-object v4, p0, Lam;->a:Landroid/widget/ListView;

    if-eqz v4, :cond_4

    .line 8182
    iget-object v4, p0, Lam;->a:Landroid/widget/ListView;

    invoke-virtual {v4, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 8183
    iget-boolean v1, p0, Lam;->ae:Z

    if-nez v1, :cond_4

    if-nez v0, :cond_4

    .line 9065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 8186
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_3

    move v3, v2

    :cond_3
    invoke-direct {p0, v2, v3}, Lam;->a(ZZ)V

    .line 373
    :cond_4
    :goto_3
    iget-object v0, p0, Lam;->b:Landroid/os/Handler;

    iget-object v1, p0, Lam;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 333
    :cond_5
    const v1, 0xff0001

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lam;->ab:Landroid/widget/TextView;

    .line 334
    iget-object v1, p0, Lam;->ab:Landroid/widget/TextView;

    if-nez v1, :cond_6

    .line 335
    const v1, 0x1020004

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lam;->aa:Landroid/view/View;

    .line 339
    :goto_4
    const v1, 0xff0002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lam;->ac:Landroid/view/View;

    .line 340
    const v1, 0xff0003

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lam;->ad:Landroid/view/View;

    .line 341
    const v1, 0x102000a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 342
    instance-of v1, v0, Landroid/widget/ListView;

    if-nez v1, :cond_8

    .line 343
    if-nez v0, :cond_7

    .line 344
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Your content must have a ListView whose id attribute is \'android.R.id.list\'"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 337
    :cond_6
    iget-object v1, p0, Lam;->ab:Landroid/widget/TextView;

    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4

    .line 348
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Content has view with id attribute \'android.R.id.list\' that is not a ListView class"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 352
    :cond_8
    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lam;->a:Landroid/widget/ListView;

    .line 353
    iget-object v0, p0, Lam;->aa:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 354
    iget-object v0, p0, Lam;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lam;->aa:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    goto/16 :goto_1

    :cond_9
    move v0, v3

    .line 8179
    goto/16 :goto_2

    .line 369
    :cond_a
    iget-object v0, p0, Lam;->ac:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 370
    invoke-direct {p0, v3, v3}, Lam;->a(ZZ)V

    goto :goto_3
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .prologue
    const/16 v8, 0x11

    const/4 v7, -0x2

    const/4 v6, -0x1

    .line 91
    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 93
    new-instance v1, Landroid/widget/FrameLayout;

    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 97
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 98
    const v3, 0xff0002

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setId(I)V

    .line 99
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 100
    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 101
    invoke-virtual {v2, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 103
    new-instance v3, Landroid/widget/ProgressBar;

    const/4 v4, 0x0

    const v5, 0x101007a

    invoke-direct {v3, v0, v4, v5}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 105
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v4, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 108
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 114
    const v0, 0xff0003

    invoke-virtual {v2, v0}, Landroid/widget/FrameLayout;->setId(I)V

    .line 116
    new-instance v0, Landroid/widget/TextView;

    .line 2612
    iget-object v3, p0, Lj;->y:Lm;

    .line 116
    invoke-direct {v0, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 117
    const v3, 0xff0001

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setId(I)V

    .line 118
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 119
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v0, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 122
    new-instance v0, Landroid/widget/ListView;

    .line 3612
    iget-object v3, p0, Lj;->y:Lm;

    .line 122
    invoke-direct {v0, v3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 123
    const v3, 0x102000a

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setId(I)V

    .line 124
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setDrawSelectorOnTop(Z)V

    .line 125
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v0, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 128
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 133
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 136
    return-object v1
.end method

.method public a(Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 173
    return-void
.end method

.method public final a(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 144
    invoke-super {p0, p1, p2}, Lj;->a(Landroid/view/View;Landroid/os/Bundle;)V

    .line 145
    invoke-direct {p0}, Lam;->p()V

    .line 146
    return-void
.end method

.method public final d()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 153
    iget-object v0, p0, Lam;->b:Landroid/os/Handler;

    iget-object v1, p0, Lam;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 154
    iput-object v2, p0, Lam;->a:Landroid/widget/ListView;

    .line 155
    const/4 v0, 0x0

    iput-boolean v0, p0, Lam;->ae:Z

    .line 156
    iput-object v2, p0, Lam;->ad:Landroid/view/View;

    iput-object v2, p0, Lam;->ac:Landroid/view/View;

    iput-object v2, p0, Lam;->aa:Landroid/view/View;

    .line 157
    iput-object v2, p0, Lam;->ab:Landroid/widget/TextView;

    .line 158
    invoke-super {p0}, Lj;->d()V

    .line 159
    return-void
.end method
