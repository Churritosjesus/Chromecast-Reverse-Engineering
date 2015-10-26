.class final Lany;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field private synthetic a:Z

.field private synthetic b:Land;


# direct methods
.method constructor <init>(Land;Z)V
    .locals 0

    .prologue
    .line 1539
    iput-object p1, p0, Lany;->b:Land;

    iput-boolean p2, p0, Lany;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 1543
    iget-boolean v0, p0, Lany;->a:Z

    if-eqz v0, :cond_0

    .line 1544
    iget-object v0, p0, Lany;->b:Land;

    invoke-virtual {v0}, Land;->finish()V

    .line 1549
    :goto_0
    return-void

    .line 1546
    :cond_0
    iget-object v0, p0, Lany;->b:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 1547
    iget-object v0, p0, Lany;->b:Land;

    invoke-static {v0}, Land;->g(Land;)Laop;

    move-result-object v0

    invoke-interface {v0}, Laop;->b()V

    goto :goto_0
.end method
