.class public final Lcqj;
.super Lcqp;
.source "PG"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcqp;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;Z)V

    .line 61
    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->hQ:I

    .line 87
    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, La;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcqj;Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;Lcqq;I)V
    .locals 7

    .prologue
    const/4 v3, -0x1

    .line 25
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, v3

    move-object v6, p3

    .line 1187
    invoke-virtual/range {v0 .. v6}, Lcqp;->a(Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;IIILcqq;)V

    .line 25
    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .prologue
    .line 70
    new-instance v0, Lcqk;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcqk;-><init>(Lcqj;Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {p0, v0}, Lcqj;->a(Lcqq;)V

    .line 71
    return-void
.end method

.method protected final a(Lcqq;Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 75
    if-nez p2, :cond_0

    .line 76
    iget-object v0, p1, Lcqq;->e:Landroid/widget/ImageView;

    .line 78
    iget-object v1, p0, Lcqj;->a:Landroid/content/Context;

    invoke-static {v1}, Lcqj;->a(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 83
    :goto_0
    return-void

    .line 81
    :cond_0
    invoke-super {p0, p1, p2}, Lcqp;->a(Lcqq;Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method
