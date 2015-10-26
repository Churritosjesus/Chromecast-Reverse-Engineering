.class final Lcyu;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcyv;

    invoke-direct {v0, p0}, Lcyv;-><init>(Lcyu;)V

    return-void
.end method


# virtual methods
.method public final a(ILcyw;)Lcyt;
    .locals 3

    .prologue
    const/high16 v2, 0x100000

    .line 1000
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 0
    const/16 v1, 0xc

    if-ge v0, v1, :cond_0

    new-instance v0, Lcxv;

    invoke-direct {v0, v2, p2}, Lcxv;-><init>(ILcyw;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcvv;

    invoke-direct {v0, v2, p2}, Lcvv;-><init>(ILcyw;)V

    goto :goto_0
.end method
