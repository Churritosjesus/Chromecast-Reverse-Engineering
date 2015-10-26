.class public final Lalx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lauo;


# instance fields
.field private synthetic a:Ldcj;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;Ldcj;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 532
    iput-object p1, p0, Lalx;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iput-object p2, p0, Lalx;->a:Ldcj;

    iput-object p3, p0, Lalx;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 545
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v3

    .line 546
    iget-object v0, p0, Lalx;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iget-object v1, p0, Lalx;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    sget v2, Lb;->ah:I

    .line 547
    invoke-virtual {v1, v2}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 546
    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 548
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 549
    return-void
.end method

.method public final a(Z)V
    .locals 3

    .prologue
    .line 535
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lalx;->a:Ldcj;

    iget-object v2, v2, Ldcj;->j:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lalx;->a:Ldcj;

    iget-object v2, v2, Ldcj;->o:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 538
    iget-object v0, p0, Lalx;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iget-object v1, p0, Lalx;->c:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    iget-object v2, p0, Lalx;->a:Ldcj;

    iget-object v2, v2, Ldcj;->j:Ljava/lang/String;

    .line 539
    invoke-virtual {v1, v2}, Lash;->b(Ljava/lang/String;)Ldcj;

    move-result-object v1

    iget-object v2, p0, Lalx;->b:Ljava/lang/String;

    .line 538
    invoke-virtual {v0, v1, v2}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->b(Ldcj;Ljava/lang/String;)V

    .line 541
    return-void
.end method
