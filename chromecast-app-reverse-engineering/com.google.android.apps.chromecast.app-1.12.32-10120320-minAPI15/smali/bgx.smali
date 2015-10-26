.class final Lbgx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Lbgv;


# direct methods
.method constructor <init>(Lbgv;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lbgx;->a:Lbgv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lbgx;->a:Lbgv;

    invoke-static {v0}, Lbgv;->b(Lbgv;)Lbgz;

    move-result-object v0

    invoke-interface {v0}, Lbgz;->a()V

    .line 71
    return-void
.end method
