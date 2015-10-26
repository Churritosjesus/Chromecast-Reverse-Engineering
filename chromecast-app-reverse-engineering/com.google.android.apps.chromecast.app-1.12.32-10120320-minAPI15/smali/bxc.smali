.class final Lbxc;
.super Ljava/lang/Object;

# interfaces
.implements Lbyy;


# instance fields
.field private synthetic a:Lbwz;


# direct methods
.method constructor <init>(Lbwz;)V
    .locals 0

    iput-object p1, p0, Lbxc;->a:Lbwz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()Z
    .locals 1

    .prologue
    .line 0
    iget-object v0, p0, Lbxc;->a:Lbwz;

    .line 1000
    iget-object v0, v0, Lbwz;->p:Lbxj;

    instance-of v0, v0, Lbwr;

    .line 0
    return v0
.end method
