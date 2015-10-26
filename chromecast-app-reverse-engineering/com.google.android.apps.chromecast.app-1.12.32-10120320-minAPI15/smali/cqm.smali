.class public final Lcqm;
.super Lcqp;
.source "PG"


# static fields
.field private static c:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcqp;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;Z)V

    .line 32
    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 85
    sget-object v0, Lcqm;->c:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 86
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->hP:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    sput-object v0, Lcqm;->c:Landroid/graphics/Bitmap;

    .line 89
    :cond_0
    sget-object v0, Lcqm;->c:Landroid/graphics/Bitmap;

    return-object v0
.end method


# virtual methods
.method protected final a(Lcqq;Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 76
    if-nez p2, :cond_0

    .line 77
    iget-object v0, p1, Lcqq;->e:Landroid/widget/ImageView;

    .line 78
    iget-object v1, p0, Lcqm;->a:Landroid/content/Context;

    invoke-static {v1}, Lcqm;->a(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 82
    :goto_0
    return-void

    .line 80
    :cond_0
    invoke-super {p0, p1, p2}, Lcqp;->a(Lcqq;Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method
