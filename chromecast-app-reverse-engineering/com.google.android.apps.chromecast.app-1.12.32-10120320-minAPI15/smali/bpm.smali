.class final Lbpm;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbql;

.field private synthetic b:Landroid/os/Handler;

.field private synthetic c:I

.field private synthetic d:Lbpk;


# direct methods
.method constructor <init>(Lbpk;Lbql;Landroid/os/Handler;I)V
    .locals 0

    iput-object p1, p0, Lbpm;->d:Lbpk;

    iput-object p2, p0, Lbpm;->a:Lbql;

    iput-object p3, p0, Lbpm;->b:Landroid/os/Handler;

    iput p4, p0, Lbpm;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lbpm;->d:Lbpk;

    iget-object v1, p0, Lbpm;->a:Lbql;

    iget-object v2, p0, Lbpm;->b:Landroid/os/Handler;

    iget v3, p0, Lbpm;->c:I

    invoke-virtual {v0, v1, v2, v3}, Lbpk;->a(Lbql;Landroid/os/Handler;I)V

    return-void
.end method
