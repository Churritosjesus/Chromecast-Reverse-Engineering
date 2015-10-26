.class public final Lamr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbog;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/MainActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V
    .locals 0

    .prologue
    .line 255
    iput-object p1, p0, Lamr;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 258
    iget-object v0, p0, Lamr;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0, p1}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Lcom/google/android/apps/chromecast/app/MainActivity;I)I

    .line 259
    iget-object v0, p0, Lamr;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->a(Lcom/google/android/apps/chromecast/app/MainActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lana;->b:Lana;

    if-ne v0, v1, :cond_0

    .line 260
    iget-object v0, p0, Lamr;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->l()V

    .line 264
    :goto_0
    return-void

    .line 262
    :cond_0
    iget-object v0, p0, Lamr;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/MainActivity;->b(Lcom/google/android/apps/chromecast/app/MainActivity;I)I

    goto :goto_0
.end method
