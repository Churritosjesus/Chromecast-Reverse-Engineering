.class public final Lti;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lse;


# instance fields
.field a:Landroid/support/v7/widget/Toolbar;

.field b:Ljava/lang/CharSequence;

.field c:Landroid/view/Window$Callback;

.field d:Z

.field private e:I

.field private f:Landroid/view/View;

.field private g:Landroid/view/View;

.field private h:Landroid/graphics/drawable/Drawable;

.field private i:Landroid/graphics/drawable/Drawable;

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:Z

.field private l:Ljava/lang/CharSequence;

.field private m:Ljava/lang/CharSequence;

.field private n:Lvu;

.field private o:I

.field private final p:Ltf;

.field private q:I

.field private r:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/Toolbar;Z)V
    .locals 2

    .prologue
    .line 87
    sget v0, La;->bT:I

    sget v1, La;->ao:I

    invoke-direct {p0, p1, p2, v0, v1}, Lti;-><init>(Landroid/support/v7/widget/Toolbar;ZII)V

    .line 89
    return-void
.end method

.method private constructor <init>(Landroid/support/v7/widget/Toolbar;ZII)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v1, 0x0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput v1, p0, Lti;->o:I

    .line 83
    iput v1, p0, Lti;->q:I

    .line 93
    iput-object p1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 2547
    iget-object v0, p1, Landroid/support/v7/widget/Toolbar;->k:Ljava/lang/CharSequence;

    .line 94
    iput-object v0, p0, Lti;->b:Ljava/lang/CharSequence;

    .line 2603
    iget-object v0, p1, Landroid/support/v7/widget/Toolbar;->l:Ljava/lang/CharSequence;

    .line 95
    iput-object v0, p0, Lti;->l:Ljava/lang/CharSequence;

    .line 96
    iget-object v0, p0, Lti;->b:Ljava/lang/CharSequence;

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lti;->k:Z

    .line 97
    invoke-virtual {p1}, Landroid/support/v7/widget/Toolbar;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lti;->j:Landroid/graphics/drawable/Drawable;

    .line 99
    if-eqz p2, :cond_11

    .line 100
    invoke-virtual {p1}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v2, 0x0

    sget-object v3, Loq;->a:[I

    sget v4, La;->i:I

    invoke-static {v0, v2, v3, v4, v1}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v0

    .line 103
    sget v2, Loq;->r:I

    invoke-virtual {v0, v2}, Lth;->c(I)Ljava/lang/CharSequence;

    move-result-object v2

    .line 104
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 105
    invoke-virtual {p0, v2}, Lti;->b(Ljava/lang/CharSequence;)V

    .line 108
    :cond_0
    sget v2, Loq;->p:I

    invoke-virtual {v0, v2}, Lth;->c(I)Ljava/lang/CharSequence;

    move-result-object v2

    .line 109
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 110
    invoke-virtual {p0, v2}, Lti;->c(Ljava/lang/CharSequence;)V

    .line 113
    :cond_1
    sget v2, Loq;->n:I

    invoke-virtual {v0, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 114
    if-eqz v2, :cond_2

    .line 3361
    iput-object v2, p0, Lti;->i:Landroid/graphics/drawable/Drawable;

    .line 3362
    invoke-direct {p0}, Lti;->p()V

    .line 118
    :cond_2
    sget v2, Loq;->m:I

    invoke-virtual {v0, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 119
    iget-object v3, p0, Lti;->j:Landroid/graphics/drawable/Drawable;

    if-nez v3, :cond_3

    if-eqz v2, :cond_3

    .line 4350
    iput-object v2, p0, Lti;->h:Landroid/graphics/drawable/Drawable;

    .line 4351
    invoke-direct {p0}, Lti;->p()V

    .line 123
    :cond_3
    sget v2, Loq;->l:I

    invoke-virtual {v0, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 124
    if-eqz v2, :cond_4

    .line 125
    invoke-virtual {p0, v2}, Lti;->a(Landroid/graphics/drawable/Drawable;)V

    .line 128
    :cond_4
    sget v2, Loq;->h:I

    invoke-virtual {v0, v2, v1}, Lth;->a(II)I

    move-result v2

    invoke-virtual {p0, v2}, Lti;->a(I)V

    .line 130
    sget v2, Loq;->g:I

    invoke-virtual {v0, v2, v1}, Lth;->e(II)I

    move-result v2

    .line 132
    if-eqz v2, :cond_7

    .line 133
    iget-object v3, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v3}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    iget-object v4, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v3, v2, v4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 4586
    iget-object v3, p0, Lti;->g:Landroid/view/View;

    if-eqz v3, :cond_5

    iget v3, p0, Lti;->e:I

    and-int/lit8 v3, v3, 0x10

    if-eqz v3, :cond_5

    .line 4587
    iget-object v3, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v4, p0, Lti;->g:Landroid/view/View;

    invoke-virtual {v3, v4}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V

    .line 4589
    :cond_5
    iput-object v2, p0, Lti;->g:Landroid/view/View;

    .line 4590
    if-eqz v2, :cond_6

    iget v2, p0, Lti;->e:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_6

    .line 4591
    iget-object v2, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v3, p0, Lti;->g:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/Toolbar;->addView(Landroid/view/View;)V

    .line 135
    :cond_6
    iget v2, p0, Lti;->e:I

    or-int/lit8 v2, v2, 0x10

    invoke-virtual {p0, v2}, Lti;->a(I)V

    .line 138
    :cond_7
    sget v2, Loq;->j:I

    invoke-virtual {v0, v2, v1}, Lth;->d(II)I

    move-result v2

    .line 139
    if-lez v2, :cond_8

    .line 140
    iget-object v3, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v3}, Landroid/support/v7/widget/Toolbar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 141
    iput v2, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 142
    iget-object v2, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/Toolbar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    :cond_8
    sget v2, Loq;->f:I

    invoke-virtual {v0, v2, v5}, Lth;->b(II)I

    move-result v2

    .line 147
    sget v3, Loq;->e:I

    invoke-virtual {v0, v3, v5}, Lth;->b(II)I

    move-result v3

    .line 149
    if-gez v2, :cond_9

    if-ltz v3, :cond_a

    .line 150
    :cond_9
    iget-object v4, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 4889
    iget-object v4, v4, Landroid/support/v7/widget/Toolbar;->j:Lsl;

    invoke-virtual {v4, v2, v3}, Lsl;->a(II)V

    .line 154
    :cond_a
    sget v2, Loq;->s:I

    invoke-virtual {v0, v2, v1}, Lth;->e(II)I

    move-result v2

    .line 155
    if-eqz v2, :cond_b

    .line 156
    iget-object v3, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v4, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v4}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 5656
    iput v2, v3, Landroid/support/v7/widget/Toolbar;->h:I

    .line 5657
    iget-object v5, v3, Landroid/support/v7/widget/Toolbar;->b:Landroid/widget/TextView;

    if-eqz v5, :cond_b

    .line 5658
    iget-object v3, v3, Landroid/support/v7/widget/Toolbar;->b:Landroid/widget/TextView;

    invoke-virtual {v3, v4, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 159
    :cond_b
    sget v2, Loq;->q:I

    invoke-virtual {v0, v2, v1}, Lth;->e(II)I

    move-result v2

    .line 161
    if-eqz v2, :cond_c

    .line 162
    iget-object v3, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v4, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v4}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 5667
    iput v2, v3, Landroid/support/v7/widget/Toolbar;->i:I

    .line 5668
    iget-object v5, v3, Landroid/support/v7/widget/Toolbar;->c:Landroid/widget/TextView;

    if-eqz v5, :cond_c

    .line 5669
    iget-object v3, v3, Landroid/support/v7/widget/Toolbar;->c:Landroid/widget/TextView;

    invoke-virtual {v3, v4, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 165
    :cond_c
    sget v2, Loq;->o:I

    invoke-virtual {v0, v2, v1}, Lth;->e(II)I

    move-result v2

    .line 166
    if-eqz v2, :cond_d

    .line 167
    iget-object v3, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v3, v2}, Landroid/support/v7/widget/Toolbar;->a(I)V

    .line 6183
    :cond_d
    iget-object v2, v0, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 172
    invoke-virtual {v0}, Lth;->a()Ltf;

    move-result-object v0

    iput-object v0, p0, Lti;->p:Ltf;

    .line 7207
    :goto_1
    iget v0, p0, Lti;->q:I

    if-eq p3, v0, :cond_e

    .line 7210
    iput p3, p0, Lti;->q:I

    .line 7211
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->d()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 7212
    iget v0, p0, Lti;->q:I

    invoke-virtual {p0, v0}, Lti;->c(I)V

    .line 180
    :cond_e
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->d()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lti;->m:Ljava/lang/CharSequence;

    .line 182
    iget-object v0, p0, Lti;->p:Ltf;

    .line 8166
    invoke-virtual {v0, p4, v1}, Ltf;->a(IZ)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 8218
    iget-object v1, p0, Lti;->r:Landroid/graphics/drawable/Drawable;

    if-eq v1, v0, :cond_f

    .line 8219
    iput-object v0, p0, Lti;->r:Landroid/graphics/drawable/Drawable;

    .line 8220
    invoke-direct {p0}, Lti;->r()V

    .line 184
    :cond_f
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    new-instance v1, Ltj;

    invoke-direct {v1, p0}, Ltj;-><init>(Lti;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View$OnClickListener;)V

    .line 194
    return-void

    :cond_10
    move v0, v1

    .line 96
    goto/16 :goto_0

    .line 6225
    :cond_11
    const/16 v0, 0xb

    .line 6227
    iget-object v2, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v2}, Landroid/support/v7/widget/Toolbar;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_12

    .line 6228
    const/16 v0, 0xf

    .line 174
    :cond_12
    iput v0, p0, Lti;->e:I

    .line 176
    invoke-virtual {p1}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ltf;->a(Landroid/content/Context;)Ltf;

    move-result-object v0

    iput-object v0, p0, Lti;->p:Ltf;

    goto :goto_1
.end method

.method private d(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 283
    iput-object p1, p0, Lti;->b:Ljava/lang/CharSequence;

    .line 284
    iget v0, p0, Lti;->e:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/Toolbar;->a(Ljava/lang/CharSequence;)V

    .line 287
    :cond_0
    return-void
.end method

.method private p()V
    .locals 4

    .prologue
    .line 366
    const/4 v0, 0x0

    .line 367
    iget v1, p0, Lti;->e:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    .line 368
    iget v0, p0, Lti;->e:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_5

    .line 369
    iget-object v0, p0, Lti;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lti;->i:Landroid/graphics/drawable/Drawable;

    .line 374
    :cond_0
    :goto_0
    iget-object v1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 9440
    if-eqz v0, :cond_6

    .line 9504
    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/widget/ImageView;

    if-nez v2, :cond_1

    .line 9505
    new-instance v2, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v2, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/widget/ImageView;

    .line 9442
    :cond_1
    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_2

    .line 9443
    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View;)V

    .line 9444
    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->b(Landroid/view/View;)V

    .line 9449
    :cond_2
    :goto_1
    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/widget/ImageView;

    if-eqz v2, :cond_3

    .line 9450
    iget-object v1, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 375
    :cond_3
    return-void

    .line 369
    :cond_4
    iget-object v0, p0, Lti;->h:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    .line 371
    :cond_5
    iget-object v0, p0, Lti;->h:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    .line 9446
    :cond_6
    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/widget/ImageView;

    if-eqz v2, :cond_2

    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 9447
    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V

    goto :goto_1
.end method

.method private q()V
    .locals 2

    .prologue
    .line 654
    iget v0, p0, Lti;->e:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    .line 655
    iget-object v0, p0, Lti;->m:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 656
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget v1, p0, Lti;->q:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->b(I)V

    .line 661
    :cond_0
    :goto_0
    return-void

    .line 658
    :cond_1
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Lti;->m:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->c(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private r()V
    .locals 2

    .prologue
    .line 664
    iget v0, p0, Lti;->e:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    .line 665
    iget-object v1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v0, p0, Lti;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lti;->j:Landroid/graphics/drawable/Drawable;

    :goto_0
    invoke-virtual {v1, v0}, Landroid/support/v7/widget/Toolbar;->a(Landroid/graphics/drawable/Drawable;)V

    .line 667
    :cond_0
    return-void

    .line 665
    :cond_1
    iget-object v0, p0, Lti;->r:Landroid/graphics/drawable/Drawable;

    goto :goto_0
.end method


# virtual methods
.method public final a()Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    return-object v0
.end method

.method public final a(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 429
    iget v0, p0, Lti;->e:I

    .line 430
    xor-int/2addr v0, p1

    .line 431
    iput p1, p0, Lti;->e:I

    .line 432
    if-eqz v0, :cond_3

    .line 433
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 434
    and-int/lit8 v1, p1, 0x4

    if-eqz v1, :cond_4

    .line 435
    invoke-direct {p0}, Lti;->r()V

    .line 436
    invoke-direct {p0}, Lti;->q()V

    .line 442
    :cond_0
    :goto_0
    and-int/lit8 v1, v0, 0x3

    if-eqz v1, :cond_1

    .line 443
    invoke-direct {p0}, Lti;->p()V

    .line 446
    :cond_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    .line 447
    and-int/lit8 v1, p1, 0x8

    if-eqz v1, :cond_5

    .line 448
    iget-object v1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v2, p0, Lti;->b:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->a(Ljava/lang/CharSequence;)V

    .line 449
    iget-object v1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v2, p0, Lti;->l:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->b(Ljava/lang/CharSequence;)V

    .line 456
    :cond_2
    :goto_1
    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_3

    iget-object v0, p0, Lti;->g:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 457
    and-int/lit8 v0, p1, 0x10

    if-eqz v0, :cond_6

    .line 458
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Lti;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->addView(Landroid/view/View;)V

    .line 464
    :cond_3
    :goto_2
    return-void

    .line 438
    :cond_4
    iget-object v1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->a(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 451
    :cond_5
    iget-object v1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->a(Ljava/lang/CharSequence;)V

    .line 452
    iget-object v1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->b(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 460
    :cond_6
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Lti;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V

    goto :goto_2
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 631
    iput-object p1, p0, Lti;->j:Landroid/graphics/drawable/Drawable;

    .line 632
    invoke-direct {p0}, Lti;->r()V

    .line 633
    return-void
.end method

.method public final a(Landroid/view/Menu;Lqq;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 409
    iget-object v0, p0, Lti;->n:Lvu;

    if-nez v0, :cond_0

    .line 410
    new-instance v0, Lvu;

    iget-object v1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lvu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lti;->n:Lvu;

    .line 413
    :cond_0
    iget-object v0, p0, Lti;->n:Lvu;

    .line 14148
    iput-object p2, v0, Lpv;->d:Lqq;

    .line 414
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    check-cast p1, Lqa;

    iget-object v1, p0, Lti;->n:Lvu;

    .line 14367
    if-nez p1, :cond_1

    iget-object v2, v0, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    if-eqz v2, :cond_4

    .line 14371
    :cond_1
    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->f()V

    .line 14372
    iget-object v2, v0, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    .line 14649
    iget-object v2, v2, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    .line 14373
    if-eq v2, p1, :cond_4

    .line 14377
    if-eqz v2, :cond_2

    .line 14378
    iget-object v3, v0, Landroid/support/v7/widget/Toolbar;->n:Lvu;

    invoke-virtual {v2, v3}, Lqa;->b(Lqp;)V

    .line 14379
    iget-object v3, v0, Landroid/support/v7/widget/Toolbar;->o:Laar;

    invoke-virtual {v2, v3}, Lqa;->b(Lqp;)V

    .line 14382
    :cond_2
    iget-object v2, v0, Landroid/support/v7/widget/Toolbar;->o:Laar;

    if-nez v2, :cond_3

    .line 14383
    new-instance v2, Laar;

    .line 14881
    invoke-direct {v2, v0}, Laar;-><init>(Landroid/support/v7/widget/Toolbar;)V

    .line 14383
    iput-object v2, v0, Landroid/support/v7/widget/Toolbar;->o:Laar;

    .line 15156
    :cond_3
    iput-boolean v4, v1, Lvu;->i:Z

    .line 14387
    if-eqz p1, :cond_5

    .line 14388
    iget-object v2, v0, Landroid/support/v7/widget/Toolbar;->f:Landroid/content/Context;

    invoke-virtual {p1, v1, v2}, Lqa;->a(Lqp;Landroid/content/Context;)V

    .line 14389
    iget-object v2, v0, Landroid/support/v7/widget/Toolbar;->o:Laar;

    iget-object v3, v0, Landroid/support/v7/widget/Toolbar;->f:Landroid/content/Context;

    invoke-virtual {p1, v2, v3}, Lqa;->a(Lqp;Landroid/content/Context;)V

    .line 14396
    :goto_0
    iget-object v2, v0, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    iget v3, v0, Landroid/support/v7/widget/Toolbar;->g:I

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/ActionMenuView;->a(I)V

    .line 14397
    iget-object v2, v0, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/ActionMenuView;->a(Lvu;)V

    .line 14398
    iput-object v1, v0, Landroid/support/v7/widget/Toolbar;->n:Lvu;

    .line 415
    :cond_4
    return-void

    .line 14391
    :cond_5
    iget-object v2, v0, Landroid/support/v7/widget/Toolbar;->f:Landroid/content/Context;

    invoke-virtual {v1, v2, v5}, Lvu;->a(Landroid/content/Context;Lqa;)V

    .line 14392
    iget-object v2, v0, Landroid/support/v7/widget/Toolbar;->o:Laar;

    iget-object v3, v0, Landroid/support/v7/widget/Toolbar;->f:Landroid/content/Context;

    invoke-virtual {v2, v3, v5}, Laar;->a(Landroid/content/Context;Lqa;)V

    .line 14393
    invoke-virtual {v1, v4}, Lvu;->b(Z)V

    .line 14394
    iget-object v2, v0, Landroid/support/v7/widget/Toolbar;->o:Laar;

    invoke-virtual {v2, v4}, Laar;->b(Z)V

    goto :goto_0
.end method

.method public final a(Landroid/view/Window$Callback;)V
    .locals 0

    .prologue
    .line 260
    iput-object p1, p0, Lti;->c:Landroid/view/Window$Callback;

    .line 261
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 266
    iget-boolean v0, p0, Lti;->k:Z

    if-nez v0, :cond_0

    .line 267
    invoke-direct {p0, p1}, Lti;->d(Ljava/lang/CharSequence;)V

    .line 269
    :cond_0
    return-void
.end method

.method public final a(Lqq;Lqb;)V
    .locals 1

    .prologue
    .line 703
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 16765
    iput-object p1, v0, Landroid/support/v7/widget/Toolbar;->p:Lqq;

    .line 16766
    iput-object p2, v0, Landroid/support/v7/widget/Toolbar;->q:Lqb;

    .line 704
    return-void
.end method

.method public final a(Lsm;)V
    .locals 2

    .prologue
    .line 468
    iget-object v0, p0, Lti;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lti;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    if-ne v0, v1, :cond_0

    .line 469
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Lti;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V

    .line 471
    :cond_0
    iput-object p1, p0, Lti;->f:Landroid/view/View;

    .line 480
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 494
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 15756
    iput-boolean p1, v0, Landroid/support/v7/widget/Toolbar;->r:Z

    .line 15757
    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V

    .line 495
    return-void
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 602
    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    .line 603
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lih;->a(F)Lih;

    move-result-object v0

    new-instance v1, Ltk;

    invoke-direct {v1, p0}, Ltk;-><init>(Lti;)V

    invoke-virtual {v0, v1}, Lih;->a(Liu;)Lih;

    .line 627
    :cond_0
    :goto_0
    return-void

    .line 618
    :cond_1
    if-nez p1, :cond_0

    .line 619
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lih;->a(F)Lih;

    move-result-object v0

    new-instance v1, Ltl;

    invoke-direct {v1, p0}, Ltl;-><init>(Lti;)V

    invoke-virtual {v0, v1}, Lih;->a(Liu;)Lih;

    goto :goto_0
.end method

.method public final b(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 278
    const/4 v0, 0x1

    iput-boolean v0, p0, Lti;->k:Z

    .line 279
    invoke-direct {p0, p1}, Lti;->d(Ljava/lang/CharSequence;)V

    .line 280
    return-void
.end method

.method public final c(I)V
    .locals 1

    .prologue
    .line 650
    if-nez p1, :cond_0

    const/4 v0, 0x0

    .line 16644
    :goto_0
    iput-object v0, p0, Lti;->m:Ljava/lang/CharSequence;

    .line 16645
    invoke-direct {p0}, Lti;->q()V

    .line 651
    return-void

    .line 16240
    :cond_0
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 650
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final c(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 296
    iput-object p1, p0, Lti;->l:Ljava/lang/CharSequence;

    .line 297
    iget v0, p0, Lti;->e:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    .line 298
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/Toolbar;->b(Ljava/lang/CharSequence;)V

    .line 300
    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 2

    .prologue
    .line 250
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 8520
    iget-object v1, v0, Landroid/support/v7/widget/Toolbar;->o:Laar;

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->o:Laar;

    iget-object v0, v0, Laar;->a:Lqe;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 250
    goto :goto_0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 255
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->c()V

    .line 256
    return-void
.end method

.method public final d(I)V
    .locals 1

    .prologue
    .line 692
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 693
    return-void
.end method

.method public final e()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 8547
    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->k:Ljava/lang/CharSequence;

    .line 273
    return-object v0
.end method

.method public final f()Z
    .locals 2

    .prologue
    .line 379
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 10329
    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    .line 10549
    iget-boolean v0, v0, Landroid/support/v7/widget/ActionMenuView;->b:Z

    .line 10329
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 379
    goto :goto_0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 384
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->a()Z

    move-result v0

    return v0
.end method

.method public final h()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 389
    iget-object v2, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 11344
    iget-object v3, v2, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    if-eqz v3, :cond_3

    iget-object v2, v2, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    .line 11682
    iget-object v3, v2, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    if-eqz v3, :cond_2

    iget-object v2, v2, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    .line 12368
    iget-object v3, v2, Lvu;->l:Lvx;

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lvu;->f()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move v2, v0

    .line 11682
    :goto_0
    if-eqz v2, :cond_2

    move v2, v0

    .line 11344
    :goto_1
    if-eqz v2, :cond_3

    :goto_2
    return v0

    :cond_1
    move v2, v1

    .line 12368
    goto :goto_0

    :cond_2
    move v2, v1

    .line 11682
    goto :goto_1

    :cond_3
    move v0, v1

    .line 389
    goto :goto_2
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 394
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->b()Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 399
    iget-object v2, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 13362
    iget-object v3, v2, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    if-eqz v3, :cond_1

    iget-object v2, v2, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    .line 13667
    iget-object v3, v2, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    if-eqz v3, :cond_0

    iget-object v2, v2, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    invoke-virtual {v2}, Lvu;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v0

    .line 13362
    :goto_0
    if-eqz v2, :cond_1

    :goto_1
    return v0

    :cond_0
    move v2, v1

    .line 13667
    goto :goto_0

    :cond_1
    move v0, v1

    .line 399
    goto :goto_1
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 404
    const/4 v0, 0x1

    iput-boolean v0, p0, Lti;->d:Z

    .line 405
    return-void
.end method

.method public final l()V
    .locals 2

    .prologue
    .line 419
    iget-object v0, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 15405
    iget-object v1, v0, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    if-eqz v1, :cond_0

    .line 15406
    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionMenuView;->c()V

    .line 420
    :cond_0
    return-void
.end method

.method public final m()I
    .locals 1

    .prologue
    .line 424
    iget v0, p0, Lti;->e:I

    return v0
.end method

.method public final n()I
    .locals 1

    .prologue
    .line 504
    const/4 v0, 0x0

    return v0
.end method

.method public final o()Landroid/view/Menu;
    .locals 4

    .prologue
    .line 708
    iget-object v1, p0, Lti;->a:Landroid/support/v7/widget/Toolbar;

    .line 16819
    invoke-virtual {v1}, Landroid/support/v7/widget/Toolbar;->f()V

    .line 16820
    iget-object v0, v1, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    .line 17649
    iget-object v0, v0, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    .line 16820
    if-nez v0, :cond_1

    .line 16822
    iget-object v0, v1, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionMenuView;->b()Landroid/view/Menu;

    move-result-object v0

    check-cast v0, Lqa;

    .line 16823
    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->o:Laar;

    if-nez v2, :cond_0

    .line 16824
    new-instance v2, Laar;

    .line 17881
    invoke-direct {v2, v1}, Laar;-><init>(Landroid/support/v7/widget/Toolbar;)V

    .line 16824
    iput-object v2, v1, Landroid/support/v7/widget/Toolbar;->o:Laar;

    .line 16826
    :cond_0
    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    .line 18719
    iget-object v2, v2, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    const/4 v3, 0x1

    .line 19156
    iput-boolean v3, v2, Lvu;->i:Z

    .line 16827
    iget-object v2, v1, Landroid/support/v7/widget/Toolbar;->o:Laar;

    iget-object v3, v1, Landroid/support/v7/widget/Toolbar;->f:Landroid/content/Context;

    invoke-virtual {v0, v2, v3}, Lqa;->a(Lqp;Landroid/content/Context;)V

    .line 16815
    :cond_1
    iget-object v0, v1, Landroid/support/v7/widget/Toolbar;->a:Landroid/support/v7/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionMenuView;->b()Landroid/view/Menu;

    move-result-object v0

    .line 708
    return-object v0
.end method
