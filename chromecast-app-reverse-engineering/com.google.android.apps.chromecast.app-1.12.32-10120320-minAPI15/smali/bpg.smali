.class final Lbpg;
.super Ljava/lang/Object;

# interfaces
.implements Lbsf;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lbrb;

.field final synthetic c:Lbql;

.field final synthetic d:Lbpf;


# direct methods
.method constructor <init>(Lbpf;ILbrb;Lbql;)V
    .locals 0

    iput-object p1, p0, Lbpg;->d:Lbpf;

    iput p2, p0, Lbpg;->a:I

    iput-object p3, p0, Lbpg;->b:Lbrb;

    iput-object p4, p0, Lbpg;->c:Lbql;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lbpg;->d:Lbpf;

    invoke-static {v0}, Lbpf;->a(Lbpf;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lbph;

    invoke-direct {v1, p0}, Lbph;-><init>(Lbpg;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
