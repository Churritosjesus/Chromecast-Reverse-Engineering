.class public final Lalz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;)V
    .locals 0

    .prologue
    .line 649
    iput-object p1, p0, Lalz;->a:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 652
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v2

    .line 653
    iget-object v0, p0, Lalz;->a:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    sget v1, Lb;->ag:I

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 655
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 656
    return-void
.end method
