.class final Laqt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Laqj;


# direct methods
.method constructor <init>(Laqj;)V
    .locals 0

    .prologue
    .line 379
    iput-object p1, p0, Laqt;->a:Laqj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 383
    iget-object v0, p0, Laqt;->a:Laqj;

    invoke-static {v0}, Laqj;->d(Laqj;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lb;->S:I

    new-array v2, v5, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Laqt;->a:Laqj;

    .line 384
    invoke-static {v4}, Laqj;->b(Laqj;)Laow;

    move-result-object v4

    invoke-virtual {v4}, Laow;->g()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 383
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 385
    iget-object v1, p0, Laqt;->a:Laqj;

    invoke-static {v1}, Laqj;->d(Laqj;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 386
    return-void
.end method
