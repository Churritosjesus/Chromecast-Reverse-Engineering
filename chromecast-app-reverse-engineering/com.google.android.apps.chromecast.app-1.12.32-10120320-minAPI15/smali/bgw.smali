.class final Lbgw;
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
    .line 73
    iput-object p1, p0, Lbgw;->a:Lbgv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 76
    iget-object v0, p0, Lbgw;->a:Lbgv;

    invoke-static {v0}, Lbgv;->b(Lbgv;)Lbgz;

    move-result-object v0

    iget-object v1, p0, Lbgw;->a:Lbgv;

    invoke-static {v1}, Lbgv;->a(Lbgv;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lbgz;->a_(Ljava/lang/String;)V

    .line 77
    return-void
.end method
