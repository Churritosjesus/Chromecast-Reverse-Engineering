.class public Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;
.super Landroid/widget/ImageView;
.source "PG"


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Lblp;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 27
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    new-instance v0, Lblp;

    const-string v1, "ReusableImageView"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->b:Lblp;

    .line 36
    return-void
.end method

.method public static synthetic a(Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a(Laer;Ljava/lang/String;ZII)V
    .locals 3

    .prologue
    .line 49
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    :cond_0
    :goto_0
    return-void

    .line 53
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 54
    if-eqz p5, :cond_2

    if-eqz p4, :cond_2

    .line 55
    iput p5, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 56
    iput p4, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 58
    :cond_2
    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    div-int/lit8 v0, p4, 0x2

    div-int/lit8 v1, p5, 0x2

    invoke-static {v0, v1, p2}, Lbks;->a(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a:Ljava/lang/String;

    .line 61
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 62
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 63
    if-eqz p1, :cond_0

    .line 64
    iget-object v0, p0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a:Ljava/lang/String;

    new-instance v1, Lbms;

    invoke-direct {v1, p0, p3}, Lbms;-><init>(Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;Z)V

    invoke-virtual {p1, v0, v1}, Laer;->a(Ljava/lang/String;Laey;)Laex;

    goto :goto_0
.end method
