.class Lcvd;
.super Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 3000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcvc;
    .locals 1

    .prologue
    .line 1000
    new-instance v0, Lcvc;

    invoke-direct {v0}, Lcvc;-><init>()V

    return-object v0
.end method

.method public b()Lcvc;
    .locals 1

    .prologue
    .line 2000
    new-instance v0, Lcvc;

    invoke-direct {v0}, Lcvc;-><init>()V

    return-object v0
.end method
