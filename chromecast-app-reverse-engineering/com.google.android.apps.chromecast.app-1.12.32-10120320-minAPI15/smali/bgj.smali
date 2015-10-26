.class final Lbgj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldbf;

.field private synthetic b:Lbgh;


# direct methods
.method constructor <init>(Lbgh;Ldbf;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lbgj;->b:Lbgh;

    iput-object p2, p0, Lbgj;->a:Ldbf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lbgj;->b:Lbgh;

    .line 1024
    iget-object v0, v0, Lbgh;->k:Lbgk;

    .line 86
    iget-object v1, p0, Lbgj;->a:Ldbf;

    invoke-interface {v0, v1}, Lbgk;->a(Ldbf;)V

    .line 87
    return-void
.end method
