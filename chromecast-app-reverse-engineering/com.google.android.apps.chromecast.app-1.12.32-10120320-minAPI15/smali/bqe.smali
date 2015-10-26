.class public final Lbqe;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lcks;


# direct methods
.method constructor <init>(Lcks;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lbqe;->b:Lcks;

    iput-object p2, p0, Lbqe;->a:Ljava/lang/Object;

    return-void
.end method

.method static a(Ljava/lang/String;II)Lbqe;
    .locals 3

    new-instance v0, Lbqe;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p0, v1}, Lcks;->a(Ljava/lang/String;Ljava/lang/Integer;)Lcks;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lbqe;-><init>(Lcks;Ljava/lang/Object;)V

    return-object v0
.end method

.method static a(Ljava/lang/String;JJ)Lbqe;
    .locals 3

    new-instance v0, Lbqe;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p0, v1}, Lcks;->a(Ljava/lang/String;Ljava/lang/Long;)Lcks;

    move-result-object v1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lbqe;-><init>(Lcks;Ljava/lang/Object;)V

    return-object v0
.end method

.method static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbqe;
    .locals 2

    new-instance v0, Lbqe;

    invoke-static {p0, p2}, Lcks;->a(Ljava/lang/String;Ljava/lang/String;)Lcks;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lbqe;-><init>(Lcks;Ljava/lang/Object;)V

    return-object v0
.end method

.method static a(Ljava/lang/String;Z)Lbqe;
    .locals 3

    .prologue
    .line 0
    .line 1000
    new-instance v0, Lbqe;

    invoke-static {p0, p1}, Lcks;->a(Ljava/lang/String;Z)Lcks;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lbqe;-><init>(Lcks;Ljava/lang/Object;)V

    .line 0
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    sget-boolean v0, Lbyk;->a:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcks;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbqe;->b:Lcks;

    invoke-virtual {v0}, Lcks;->d()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lbqe;->a:Ljava/lang/Object;

    goto :goto_0
.end method
