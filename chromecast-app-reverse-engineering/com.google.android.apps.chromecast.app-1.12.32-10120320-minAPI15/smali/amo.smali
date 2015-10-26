.class public final Lamo;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbof;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/MainActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Lamo;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 230
    iget-object v0, p0, Lamo;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dn:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0
.end method

.method public final b(I)I
    .locals 2

    .prologue
    .line 235
    iget-object v0, p0, Lamo;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dk:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0
.end method
