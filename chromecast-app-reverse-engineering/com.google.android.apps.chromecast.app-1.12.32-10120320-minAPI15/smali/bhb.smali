.class final Lbhb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lbha;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Landroid/content/Context;


# direct methods
.method constructor <init>(Lbha;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lbhb;->a:Lbha;

    iput-object p2, p0, Lbhb;->b:Ljava/lang/String;

    iput-object p3, p0, Lbhb;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 104
    iget-object v0, p0, Lbhb;->a:Lbha;

    invoke-static {v0}, Lbha;->a(Lbha;)Lblp;

    .line 105
    iget-object v0, p0, Lbhb;->a:Lbha;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->l()Lazv;

    move-result-object v1

    invoke-static {v0, v1}, Lbha;->a(Lbha;Lazv;)Lazv;

    .line 106
    iget-object v0, p0, Lbhb;->a:Lbha;

    invoke-static {v0}, Lbha;->b(Lbha;)Lazv;

    move-result-object v0

    invoke-virtual {v0}, Lazv;->b()V

    .line 107
    iget-object v0, p0, Lbhb;->a:Lbha;

    invoke-static {v0}, Lbha;->b(Lbha;)Lazv;

    move-result-object v0

    iget-object v1, p0, Lbhb;->b:Ljava/lang/String;

    new-instance v2, Lbhc;

    invoke-direct {v2, p0}, Lbhc;-><init>(Lbhb;)V

    .line 1153
    invoke-virtual {v0, v1, v2, v5}, Lazv;->a(Ljava/lang/String;Lbaa;Z)Z

    move-result v0

    .line 126
    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lbhb;->c:Landroid/content/Context;

    iget-object v1, p0, Lbhb;->c:Landroid/content/Context;

    sget v2, Lb;->df:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lbhb;->b:Ljava/lang/String;

    aput-object v4, v3, v5

    .line 129
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 128
    invoke-static {v0, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 130
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 133
    :cond_0
    return-void
.end method
