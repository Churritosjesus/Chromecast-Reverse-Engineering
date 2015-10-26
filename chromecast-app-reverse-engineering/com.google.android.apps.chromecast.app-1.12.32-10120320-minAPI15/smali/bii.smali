.class final Lbii;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 540
    iput-object p1, p0, Lbii;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    const/4 v8, 0x0

    .line 544
    iget-object v0, p0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    .line 2825
    iput-boolean v8, v0, Land;->u:Z

    .line 545
    iget-object v0, p0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x()V

    .line 546
    iget-object v0, p0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->t()Z

    move-result v2

    .line 549
    iget-object v3, p0, Lbii;->a:Lbhf;

    iget-object v4, p0, Lbii;->a:Lbhf;

    .line 3099
    iget-object v0, v4, Lbhf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfs;

    .line 3130
    iget-object v6, v0, Lbfs;->a:Ljava/lang/String;

    .line 3100
    invoke-virtual {v4}, Lbhf;->q()Lbdf;

    move-result-object v7

    .line 3459
    iget-object v7, v7, Lbdf;->y:Ljava/lang/String;

    .line 3100
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 549
    :goto_0
    invoke-static {v2, v0}, Lbmi;->a(ZLbfs;)Lbmi;

    move-result-object v0

    invoke-static {v3, v0}, Lbhf;->a(Lbhf;Lbmi;)Lbmi;

    .line 552
    iget-object v0, p0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->c(Lbhf;)Lbmi;

    move-result-object v0

    iget-object v3, p0, Lbii;->a:Lbhf;

    .line 553
    invoke-static {v3}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v3

    .line 3808
    iget-object v3, v3, Lm;->b:Lt;

    .line 553
    const-string v4, "networkSelectorFragment"

    .line 552
    invoke-virtual {v0, v3, v4}, Lbmi;->a(Lr;Ljava/lang/String;)V

    .line 556
    if-eqz v2, :cond_2

    .line 557
    iget-object v0, p0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->y()V

    .line 4574
    :goto_1
    return-void

    :cond_1
    move-object v0, v1

    .line 3104
    goto :goto_0

    .line 561
    :cond_2
    iget-object v0, p0, Lbii;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    iget-object v2, p0, Lbii;->a:Lbhf;

    invoke-static {v2}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v2

    .line 3833
    iget-object v2, v2, Land;->p:Lbdu;

    .line 561
    new-instance v3, Lbij;

    invoke-direct {v3, p0}, Lbij;-><init>(Lbii;)V

    .line 4572
    invoke-virtual {v0}, Land;->t()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 4573
    invoke-interface {v3}, Laop;->a()V

    goto :goto_1

    .line 4578
    :cond_3
    const/16 v4, 0x1000

    new-instance v5, Lanf;

    invoke-direct {v5, v0, v2, v3}, Lanf;-><init>(Land;Lbdm;Laop;)V

    invoke-virtual {v2, v4, v1, v8, v5}, Lbdm;->a(ILjava/util/Locale;ZLbdn;)V

    goto :goto_1
.end method
