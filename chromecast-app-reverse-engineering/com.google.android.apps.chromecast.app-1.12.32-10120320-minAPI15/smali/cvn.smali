.class final Lcvn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcvl;

.field private synthetic b:J

.field private synthetic c:Ljava/lang/String;

.field private synthetic d:Lcvm;


# direct methods
.method constructor <init>(Lcvm;Lcvl;JLjava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcvn;->d:Lcvm;

    iput-object p2, p0, Lcvn;->a:Lcvl;

    iput-wide p3, p0, Lcvn;->b:J

    iput-object p5, p0, Lcvn;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcvn;->d:Lcvm;

    invoke-static {v0}, Lcvm;->a(Lcvm;)Lcvo;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcum;->a()Lcum;

    move-result-object v0

    iget-object v1, p0, Lcvn;->d:Lcvm;

    invoke-static {v1}, Lcvm;->b(Lcvm;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcvn;->a:Lcvl;

    invoke-virtual {v0, v1, v2}, Lcum;->a(Landroid/content/Context;Lcvl;)V

    iget-object v1, p0, Lcvn;->d:Lcvm;

    invoke-virtual {v0}, Lcum;->b()Lcvo;

    move-result-object v0

    invoke-static {v1, v0}, Lcvm;->a(Lcvm;Lcvo;)Lcvo;

    :cond_0
    iget-object v0, p0, Lcvn;->d:Lcvm;

    invoke-static {v0}, Lcvm;->a(Lcvm;)Lcvo;

    move-result-object v0

    iget-wide v2, p0, Lcvn;->b:J

    iget-object v1, p0, Lcvn;->c:Ljava/lang/String;

    invoke-interface {v0, v2, v3, v1}, Lcvo;->a(JLjava/lang/String;)V

    return-void
.end method
