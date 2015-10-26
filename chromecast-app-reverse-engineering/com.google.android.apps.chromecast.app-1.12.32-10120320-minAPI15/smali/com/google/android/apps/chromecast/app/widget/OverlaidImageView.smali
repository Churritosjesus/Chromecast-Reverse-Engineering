.class public Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;
.super Landroid/widget/ImageView;
.source "PG"


# instance fields
.field public final a:Landroid/animation/ValueAnimator;

.field public b:Landroid/graphics/Bitmap;

.field public c:Landroid/graphics/Bitmap;

.field public d:Landroid/graphics/Bitmap;

.field public e:Landroid/graphics/Bitmap;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Z

.field public k:Z

.field private final l:Landroid/graphics/Paint;

.field private m:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 61
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 69
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->l:Landroid/graphics/Paint;

    .line 56
    iput v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->m:I

    .line 57
    iput-boolean v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->j:Z

    .line 58
    iput-boolean v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->k:Z

    .line 70
    invoke-virtual {p0, v1}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->setWillNotDraw(Z)V

    .line 72
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    .line 111
    :goto_0
    return-void

    .line 75
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    .line 76
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    new-instance v1, Lbml;

    invoke-direct {v1, p0}, Lbml;-><init>(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 83
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 84
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    new-instance v1, Lbmm;

    invoke-direct {v1, p0}, Lbmm;-><init>(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_0

    .line 75
    :array_0
    .array-data 4
        0x0
        0xff
    .end array-data
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;I)I
    .locals 0

    .prologue
    .line 29
    iput p1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->m:I

    return p1
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->d:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->b:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->h:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IZ)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 273
    if-nez p2, :cond_0

    .line 311
    :goto_0
    return-void

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->l:Landroid/graphics/Paint;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 280
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 281
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 282
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->getWidth()I

    move-result v2

    .line 283
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->getHeight()I

    move-result v3

    .line 284
    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 285
    int-to-float v1, v2

    int-to-float v4, v3

    div-float/2addr v1, v4

    .line 288
    if-eqz p4, :cond_2

    .line 291
    cmpl-float v1, v0, v1

    if-lez v1, :cond_1

    .line 293
    int-to-float v1, v3

    mul-float/2addr v0, v1

    float-to-int v1, v0

    .line 294
    new-instance v0, Landroid/graphics/Rect;

    sub-int v4, v2, v1

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v4, v5, v1, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 309
    :goto_1
    new-instance v1, Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-direct {v1, v5, v5, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 310
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 298
    :cond_1
    int-to-float v1, v2

    div-float v0, v1, v0

    float-to-int v1, v0

    .line 299
    new-instance v0, Landroid/graphics/Rect;

    sub-int v4, v3, v1

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v5, v4, v2, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_1

    .line 305
    :cond_2
    int-to-float v1, v3

    mul-float/2addr v0, v1

    float-to-int v1, v0

    .line 306
    new-instance v0, Landroid/graphics/Rect;

    sub-int v4, v2, v1

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v4, v5, v1, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_1
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->e:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->c:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method public static synthetic b(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->i:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic c(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic d(Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->g:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a(Lbnw;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 185
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 2069
    sget-object v0, Lbmu;->k:Lblq;

    .line 1089
    invoke-virtual {p1}, Lbnw;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lblq;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1090
    if-nez v0, :cond_0

    .line 1091
    iget v0, p1, Lbnw;->f:I

    invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 3069
    sget-object v1, Lbmu;->k:Lblq;

    .line 1092
    invoke-virtual {p1}, Lbnw;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lblq;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 185
    :cond_0
    invoke-virtual {p1}, Lbnw;->name()Ljava/lang/String;

    move-result-object v1

    .line 3161
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->h:Ljava/lang/String;

    invoke-static {v2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 3162
    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->b:Landroid/graphics/Bitmap;

    .line 3163
    iput-object v3, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->c:Landroid/graphics/Bitmap;

    .line 3181
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->invalidate()V

    .line 186
    return-void

    .line 3168
    :cond_1
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->k:Z

    .line 3169
    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->d:Landroid/graphics/Bitmap;

    .line 3170
    iput-object v3, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->e:Landroid/graphics/Bitmap;

    .line 3171
    iput-object v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->h:Ljava/lang/String;

    .line 3172
    iput-object v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->f:Ljava/lang/String;

    .line 3173
    iput-object v3, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->i:Ljava/lang/String;

    .line 3174
    iput-object v3, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->g:Ljava/lang/String;

    .line 3175
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 3176
    :cond_2
    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->b:Landroid/graphics/Bitmap;

    .line 3177
    iput-object v3, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->c:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 3179
    :cond_3
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .prologue
    const v4, 0x3e99999a    # 0.3f

    const/4 v3, 0x1

    .line 254
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 255
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->l:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 256
    iget v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->m:I

    rsub-int v0, v0, 0xff

    .line 259
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->c:Landroid/graphics/Bitmap;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->e:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    .line 260
    :cond_0
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->c:Landroid/graphics/Bitmap;

    invoke-direct {p0, p1, v1, v0, v3}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IZ)V

    .line 261
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->e:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->m:I

    invoke-direct {p0, p1, v1, v2, v3}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IZ)V

    .line 268
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->b:Landroid/graphics/Bitmap;

    iget-boolean v2, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->j:Z

    invoke-direct {p0, p1, v1, v0, v2}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IZ)V

    .line 269
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->d:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->m:I

    iget-boolean v2, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->j:Z

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IZ)V

    .line 270
    return-void

    .line 262
    :cond_2
    iget-boolean v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->k:Z

    if-eqz v1, :cond_1

    .line 263
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->b:Landroid/graphics/Bitmap;

    int-to-float v2, v0

    mul-float/2addr v2, v4

    float-to-int v2, v2

    invoke-direct {p0, p1, v1, v2, v3}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IZ)V

    .line 264
    iget-object v1, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->d:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->m:I

    int-to-float v2, v2

    mul-float/2addr v2, v4

    float-to-int v2, v2

    invoke-direct {p0, p1, v1, v2, v3}, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IZ)V

    goto :goto_0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 124
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 125
    check-cast p1, Landroid/os/Bundle;

    .line 126
    const-string v0, "fgImageUrl"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->h:Ljava/lang/String;

    .line 127
    const-string v0, "bgImageUrl"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->i:Ljava/lang/String;

    .line 128
    const-string v0, "instanceState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    .line 130
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 131
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .prologue
    .line 115
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 116
    const-string v1, "instanceState"

    invoke-super {p0}, Landroid/widget/ImageView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 117
    const-string v1, "fgImageUrl"

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const-string v1, "bgImageUrl"

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/widget/OverlaidImageView;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    return-object v0
.end method
