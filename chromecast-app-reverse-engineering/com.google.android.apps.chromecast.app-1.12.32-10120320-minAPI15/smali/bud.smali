.class public Lbud;
.super Ljava/lang/Object;


# instance fields
.field public final b:Lbuu;

.field public final c:Ljava/lang/String;

.field public d:Lbuw;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, La;->d(Ljava/lang/String;)V

    iput-object p1, p0, Lbud;->c:Ljava/lang/String;

    new-instance v0, Lbuu;

    invoke-direct {v0, p2}, Lbuu;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbud;->b:Lbuu;

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lbud;->b:Lbuu;

    .line 1000
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iput-object v0, v1, Lbuu;->a:Ljava/lang/String;

    .line 0
    :cond_0
    return-void

    .line 1000
    :cond_1
    const-string v0, "[%s] "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p3, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected final a(Ljava/lang/String;JLjava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lbud;->b:Lbuu;

    const-string v1, "Sending text message: %s to: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lbuu;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lbud;->d:Lbuw;

    iget-object v1, p0, Lbud;->c:Ljava/lang/String;

    invoke-interface {v0, v1, p1, p2, p3}, Lbuw;->a(Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method protected final d()J
    .locals 2

    iget-object v0, p0, Lbud;->d:Lbuw;

    invoke-interface {v0}, Lbuw;->a()J

    move-result-wide v0

    return-wide v0
.end method
