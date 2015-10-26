.class final Lcgh;
.super Ljava/lang/Object;


# static fields
.field static final a:[Lcah;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Lcah;

    const/4 v1, 0x0

    new-instance v2, Lcgi;

    const-string v3, "0\u0082\u0002\u00a70\u0082\u0002e\u00a0\u0003\u0002\u0001\u0002\u0002\u0004P\u0005|B0\u000b\u0006\u0007*\u0086"

    invoke-static {v3}, Lcah;->a(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v2, v3}, Lcgi;-><init>([B)V

    aput-object v2, v0, v1

    sput-object v0, Lcgh;->a:[Lcah;

    return-void
.end method
