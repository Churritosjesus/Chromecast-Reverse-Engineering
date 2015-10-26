.class final Laqb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field private synthetic a:Lapu;


# direct methods
.method constructor <init>(Lapu;)V
    .locals 0

    .prologue
    .line 289
    iput-object p1, p0, Laqb;->a:Lapu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 293
    iget-object v0, p0, Laqb;->a:Lapu;

    invoke-static {v0, v1}, Lapu;->a(Lapu;Z)Z

    .line 294
    iget-object v0, p0, Laqb;->a:Lapu;

    invoke-static {v0}, Lapu;->d(Lapu;)Laqd;

    move-result-object v0

    .line 1157
    invoke-virtual {v0, v1}, Laqd;->a(Z)V

    .line 295
    iget-object v0, p0, Laqb;->a:Lapu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lapu;->a(Lapu;Ljava/lang/String;)V

    .line 296
    return-void
.end method
