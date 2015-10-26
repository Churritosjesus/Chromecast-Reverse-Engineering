.class final Lcxc;
.super Ljava/lang/Object;

# interfaces
.implements Lcxd;


# instance fields
.field private synthetic a:Lcxa;


# direct methods
.method constructor <init>(Lcxa;)V
    .locals 0

    iput-object p1, p0, Lcxc;->a:Lcxa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lczb;)Lcwz;
    .locals 3

    .prologue
    .line 0
    new-instance v0, Lcwz;

    iget-object v1, p0, Lcxc;->a:Lcxa;

    .line 1000
    iget-object v1, v1, Lcxa;->b:Landroid/content/Context;

    .line 0
    iget-object v2, p0, Lcxc;->a:Lcxa;

    .line 2000
    iget-object v2, v2, Lcxa;->a:Ljava/lang/String;

    .line 0
    invoke-direct {v0, v1, v2, p1}, Lcwz;-><init>(Landroid/content/Context;Ljava/lang/String;Lczb;)V

    return-object v0
.end method
