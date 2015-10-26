.class public final Lblq;
.super Leh;
.source "PG"

# interfaces
.implements Laew;


# instance fields
.field private final a:Lblp;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 21
    .line 1079
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 1080
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1081
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1083
    mul-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0x2

    .line 1087
    div-int/lit8 v0, v0, 0x2

    mul-int/lit8 v0, v0, 0x3

    div-int/lit16 v0, v0, 0x400

    .line 21
    invoke-direct {p0, v0}, Leh;-><init>(I)V

    .line 22
    new-instance v0, Lblp;

    const-string v1, "LruBitmapCache"

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lblq;->a:Lblp;

    .line 23
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lblq;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 24
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p0, p1}, Lblq;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 45
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 46
    invoke-virtual {p0, p1, p2}, Lblq;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    return-void
.end method

.method protected final synthetic b(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 16
    check-cast p2, Landroid/graphics/Bitmap;

    .line 2031
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 2032
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v0

    div-int/lit16 v0, v0, 0x400

    :goto_0
    return v0

    .line 2034
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    div-int/lit16 v0, v0, 0x400

    goto :goto_0
.end method
