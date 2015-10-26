.class public final Lcuh;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcui;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcui;

    invoke-direct {v0}, Lcui;-><init>()V

    sput-object v0, Lcuh;->a:Lcui;

    return-void
.end method

.method public static a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcuh;->a:Lcui;

    invoke-virtual {v0, p0}, Lcui;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcuh;->a:Lcui;

    invoke-virtual {v0, p0, p1}, Lcui;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcuh;->a:Lcui;

    invoke-virtual {v0, p0}, Lcui;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcuh;->a:Lcui;

    invoke-virtual {v0, p0, p1}, Lcui;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
