.class final Lbxb;
.super Lbxh;


# instance fields
.field private synthetic a:Lbwz;


# direct methods
.method constructor <init>(Lbwz;)V
    .locals 0

    iput-object p1, p0, Lbxb;->a:Lbwz;

    invoke-direct {p0, p1}, Lbxh;-><init>(Lbwz;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lbxb;->a:Lbwz;

    invoke-static {v0}, Lbwz;->a(Lbwz;)Lbxj;

    move-result-object v0

    invoke-interface {v0, p1}, Lbxj;->a(Landroid/os/Bundle;)V

    return-void
.end method
